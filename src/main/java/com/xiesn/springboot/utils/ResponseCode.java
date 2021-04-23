package com.xiesn.springboot.utils;

import java.text.MessageFormat;
import java.util.Objects;

/**
 * FileName: ResponseCode
 * Author:   xiesn
 * <p>
 * <p>
 * <p>
 * =================================严重声明================================================
 * =================================严重声明================================================
 * <p>
 * <p>
 * 各模块错误码定义: 100开头为系统定义；200开头为商品;300开头为用户系统；400开头为订单系统；
 * 500开头为购物车；600开头为促销；700开头为支付;800开头为优惠券; 900库存服务  未完待续。。。。。。。。。
 * <p>
 *
 * <p>
 * <p>
 * <p>
 * <p>
 * =================================严重声明================================================
 * =================================严重声明================================================
 */

public enum ResponseCode {

    /**
     * 操作成功
     */
    SUCCESS(200, "操作成功"),
    SERVICE_LOGIN_EXCEED(302, "登录过期"),
    SERVICE_RUNTIMEEXCEPTION(555, "逻辑异常"),
    SERVICE_EXCEPTION(558, "系统异常"),
    SERVICE_UNAVAILABLE(559, "服务器内部异常"),

    /**
     * 000-010  系统（通用）级别的
     * 100-900  业务逻辑级别
     */
    WSLG_SYSTEM_HITS(100000, "{0}"),
    WSLG_MISS_PARAMETERS(100001, "缺少必要参数"),
    WSLG_INVALID_PARAMETERS(100002, "输入参数非法"),
    WSLG_BUSINESS_FAIL(100003, "操作失败，请重试!{0}"),
    WSLG_RESULT_EMPTY(100004, "查询结果为空");




    private int code;
    private String msg;

    ResponseCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getmsg() {
        return msg;
    }

    public void setmsg(String msg) {
        this.msg = msg;
    }

    public String formatResponseMessage(String... msg) {
        if (Objects.nonNull(msg)) {
            return MessageFormat.format(this.getmsg(), msg);
        } else {
            return MessageFormat.format(this.getmsg(), "");
        }
    }

    public static final String formatResponseCode(ResponseCode responseCode, Object[] objs) {
        if (objs == null || responseCode == null) {
            return null;
        }
        return MessageFormat.format(responseCode.getmsg(), objs);
    }

    public static final String formatMissParameters(Object[] objs) {
        if (objs == null) {
            return null;
        }
        return MessageFormat.format(WSLG_MISS_PARAMETERS.getmsg(), objs);
    }

    public static final String formatInvalidParameters(Object[] objs) {
        if (objs == null) {
            return null;
        }
        return MessageFormat.format(WSLG_INVALID_PARAMETERS.getmsg(), objs);
    }

    public static final String formatBusinessFail(Object[] objs) {
        if (objs == null) {
            return null;
        }
        return MessageFormat.format(WSLG_BUSINESS_FAIL.getmsg(), objs);
    }

    public static final String formatSystemHits(String... objs) {
        if (objs == null) {
            return null;
        }
        return MessageFormat.format(WSLG_SYSTEM_HITS.getmsg(), objs);
    }
}
