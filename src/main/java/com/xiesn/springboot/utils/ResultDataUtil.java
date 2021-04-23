package com.xiesn.springboot.utils;


import java.text.MessageFormat;

/**
 * common-service
 *
 * @author : pudge
 * @Package com.wslg.common.utils
 * @Description: 通用返回结构工具类
 * @date ：2019-06-19 11:04
 */
public class ResultDataUtil {

    public static <T> ResultData<T> ok(T data) {

        return new ResultData<T>(data, ResponseCode.SUCCESS);
    }
    public static <T> ResultData<T> ok() {

        return new ResultData<T>( ResponseCode.SUCCESS);
    }

    public static <T> ResultData<T> build(String msg) {

        return new ResultData<T>(ResponseCode.WSLG_SYSTEM_HITS.getCode(), MessageFormat.format(ResponseCode.WSLG_SYSTEM_HITS.getmsg(), msg));
    }

    public static <T> ResultData<T> build(ResponseCode responseCode) {

        return new ResultData<T>(responseCode);
    }

    public static <T> ResultData<T> build(T data, String msg) {

        return new ResultData<T>(data, ResponseCode.WSLG_SYSTEM_HITS.getCode(), MessageFormat.format(ResponseCode.WSLG_SYSTEM_HITS.getmsg(), msg));
    }

    public static <T> ResultData<T> build(T data, ResponseCode responseCode) {

        return new ResultData<T>(data, responseCode);
    }

    public static <T> ResultData<T> build(ResponseCode responseCode, String... msg) {

        return new ResultData<T>(responseCode.getCode(), MessageFormat.format(responseCode.getmsg(), msg));
    }

    public static <T> ResultData<T> ex(Exception ex) {
        return new ResultData<T>(ResponseCode.SERVICE_UNAVAILABLE);
    }


    public static <T> ResultPageData<T> ok(T data, PageInfo pageInfo) {
        return new ResultPageData<T>(data, pageInfo, ResponseCode.SUCCESS);
    }

}
