package com.xiesn.springboot.interceptor;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.xiesn.springboot.constant.ConstantDefine;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.ThreadContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.NamedThreadLocal;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;


/**
 * @author xiesn
 */
@Slf4j
@Component
public class UnityInterceptor implements HandlerInterceptor {


    private NamedThreadLocal<Long> startTimeThreadLocal = new NamedThreadLocal<>("StopWatch-StartTime");
    @Autowired
    private StringRedisTemplate redisTemplate;

    @Value("${ding.talk.notification}")
    private String dingTalkNotification;


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        startTimeThreadLocal.set(System.currentTimeMillis());

        StringBuffer sb = new StringBuffer();
        sb.append(dingTalkNotification)
                .append(StringUtils.LF + "【request url】: " + request.getRequestURI())
                .append(StringUtils.LF + "【request host】: " + request.getRemoteAddr());

        ThreadContext.put(ConstantDefine.REQUEST_PARAMETERS, sb.toString());

        // 如果不是映射到方法直接通过
        if (!(handler instanceof HandlerMethod)) {
            return true;
        }
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        Method method = handlerMethod.getMethod();
        // 判断接口是否需要登录
        LoginRequired methodAnnotation = method.getAnnotation(LoginRequired.class);
        // 有 @LoginRequired 注解，需要认证
        if (methodAnnotation == null) {
            return true;
        }

        //*根据token判断用户是否登录过
        String token = request.getHeader("token");
        if (StringUtils.isEmpty(token)) {
            log.warn("为获取到token");
            return false;
        }
        String userJson = redisTemplate.opsForValue().get(token);

        if (StringUtils.isEmpty(userJson)) {
            log.warn("token过期");
            return false;
        }
        JSONObject jsonObject = JSON.parseObject(userJson);
        int userId = jsonObject.getIntValue("id");
        ThreadContext.put(ConstantDefine.UserInfo.USER_INFO, userJson);
        ThreadContext.put(ConstantDefine.UserInfo.USER_ID, String.valueOf(userId));
        ThreadContext.put(ConstantDefine.UserInfo.TOKEN, token);
        return true;
    }


    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object
            o, ModelAndView modelAndView) throws Exception {

    }


    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse
            httpServletResponse, Object o, Exception e) throws Exception {
        ThreadContext.remove(ConstantDefine.REQUEST_PARAMETERS);

        long consumeTime = System.currentTimeMillis() - startTimeThreadLocal.get();
        // 此处认为处理时间超过300毫秒的请求为慢请求
//        if(consumeTime > 300) {
        log.debug("API-Service >>> URL = [" + String.format("%s] consume = %d millis", httpServletRequest.getRequestURI(), consumeTime));
//        }
    }


}
