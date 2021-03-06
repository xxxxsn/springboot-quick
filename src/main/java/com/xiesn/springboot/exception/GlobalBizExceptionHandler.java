package com.xiesn.springboot.exception;


import cn.snowheart.dingtalk.robot.starter.client.DingTalkRobotClient;
import com.xiesn.springboot.constant.ConstantDefine;
import com.xiesn.springboot.utils.ResponseCode;
import lombok.extern.slf4j.Slf4j;
import net.dreamlu.mica.core.result.R;
import org.apache.commons.lang.exception.ExceptionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.ThreadContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @FileName: ExceptionHandling
 * @Author: xiesn
 * @Description: 统一异常处理类
 */
@Slf4j
@RestControllerAdvice(value = {"com.xiesn.springboot.controller"})
public class GlobalBizExceptionHandler {

    @Autowired
    private DingTalkRobotClient dingTalkRobotClient;


    @ResponseBody
    @ExceptionHandler({LogicException.class, RException.class,
            RuntimeException.class, Exception.class})
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    public R fpExceptionHandler(Exception ex) {
        String exMessage = ex.getMessage();
        log.error("ExceptionHandling 逻辑异常:" + exMessage, ex);
        String requestParameter = ThreadContext.get(ConstantDefine.REQUEST_PARAMETERS);
        try {
            String text = requestParameter + StringUtils.LF + ExceptionUtils.getFullStackTrace(ex);
            dingTalkRobotClient.sendActionCardMessage(ex.getMessage(), text);
        } catch (Exception e) {

        }

        if (ex instanceof LogicException) {
            log.error("CustomLogicException 逻辑异常:" + (ex.getCause()), ex);
             return R.fail(ResponseCode.SERVICE_RUNTIMEEXCEPTION,exMessage);
        }
        if (ex instanceof RException) {
            log.error("CustomException 操作异常:" + (ex.getCause()), ex);
            return  R.fail(ResponseCode.SERVICE_LOGIN_EXCEPTION,exMessage);
        }
        if (ex instanceof RuntimeException) {
            log.error("RuntimeException 错误:" + (ex.getCause()), ex);
            return R.fail(ResponseCode.FAILURE,exMessage);
        }

        log.error("exception 错误:" + (ex.getCause()), ex);
        return R.fail(ResponseCode.SERVICE_UNAVAILABLE,exMessage);
    }


    @ResponseBody
    @ExceptionHandler(Throwable.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public R throwableHandler(Throwable throwable) {
        log.error("throwable 错误:" + (throwable.getCause()), throwable);
        return R.fail(ResponseCode.SERVICE_UNAVAILABLE);
    }




}
