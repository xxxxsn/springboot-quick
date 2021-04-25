package com.xiesn.springboot.utils;

import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import net.dreamlu.mica.core.result.IResultCode;

import java.text.MessageFormat;
import java.util.Objects;

/**
 * FileName: ResponseCode
 * Author:   xiesn
 */

@Getter
@RequiredArgsConstructor
@ApiModel(description = "系统内置code")
public enum ResponseCode  implements IResultCode {


    /**
     *  系统（通用）级别的异常
     */
    FAILURE(-1, "系统未知异常"),
    SUCCESS(1, "操作成功"),
    SYSTEM_HITS(-2, "{0}"),
    SERVICE_LOGIN_EXCEED(302, "登录过期"),
    SERVICE_RUNTIMEEXCEPTION(555, "逻辑异常"),
    SERVICE_LOGIN_EXCEPTION(556, "操作异常"),
    SERVICE_UNAVAILABLE(557, "服务器内部异常"),


    /**
     *  访问层 code   000-099
     */
    PARAM_MISS(100000, "缺少必要的请求参数"),
    PARAM_TYPE_ERROR(100001, "请求参数类型错误"),
    PARAM_BIND_ERROR(100002, "请求参数绑定错误"),
    PARAM_VALID_ERROR(100002, "参数校验失败"),
    NOT_FOUND(100004, "404 没找到请求"),
    MSG_NOT_READABLE(100005, "消息不能读取"),
    METHOD_NOT_SUPPORTED(100006, "不支持当前请求方法"),
    MEDIA_TYPE_NOT_SUPPORTED(100007, "不支持当前媒体类型"),
    MEDIA_TYPE_NOT_ACCEPT(100008, "不接受的媒体类型"),
    REQ_REJECT(100009, "请求被拒绝"),

    /**
     *  通用数据层 code   100-999
     */
    DATA_NOT_EXIST(100100, "数据不存在"),
    DATA_EXISTED(100101, "数据已存在"),
    DATA_ADD_FAILED(100102, "数据添加失败"),
    DATA_UPDATE_FAILED(100103, "数据更新失败"),
    DATA_DELETE_FAILED(100104, "数据删除失败"),


    ;


    /**
     * code编码
     */
    final int code;
    /**
     * 中文信息描述
     */
    final String msg;


    public String formatResponseMessage(String... msg) {
        if (Objects.nonNull(msg)) {
            return MessageFormat.format(this.getMsg(), msg);
        } else {
            return MessageFormat.format(this.getMsg(), "");
        }
    }

    public static final String formatResponseCode(ResponseCode responseCode, Object[] objs) {
        if (objs == null || responseCode == null) {
            return null;
        }
        return MessageFormat.format(responseCode.getMsg(), objs);
    }

    public static final String formatMissParameters(Object[] objs) {
        if (objs == null) {
            return null;
        }
        return MessageFormat.format(ResponseCode.PARAM_MISS.getMsg(), objs);
    }

    public static final String formatInvalidParameters(Object[] objs) {
        if (objs == null) {
            return null;
        }
        return MessageFormat.format(ResponseCode.PARAM_BIND_ERROR.getMsg(), objs);
    }

    public static final String formatBusinessFail(Object[] objs) {
        if (objs == null) {
            return null;
        }
        return MessageFormat.format(ResponseCode.FAILURE.getMsg(), objs);
    }

    public static final String formatSystemHits(String... objs) {
        if (objs == null) {
            return null;
        }
        return MessageFormat.format(SYSTEM_HITS.getMsg(), objs);
    }
}
