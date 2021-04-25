package com.xiesn.springboot.exception;


import com.xiesn.springboot.utils.ResponseCode;

/**
 * @Author: xiesn
 */
public class LogicException extends RException {


    public LogicException(String msg) {
        this(ResponseCode.SYSTEM_HITS.getCode(), ResponseCode.SYSTEM_HITS.formatResponseMessage(msg));
    }


    public LogicException(int code, String msg) {
        super(code, msg);
    }

    public LogicException(ResponseCode responseCode) {
        this(responseCode.getCode(), responseCode.getMsg());
    }

    public LogicException(ResponseCode responseCode, String msg) {
        this(responseCode.getCode(), responseCode.formatResponseMessage(responseCode.getMsg(), msg));
    }

}
