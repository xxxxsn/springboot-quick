package com.xiesn.springboot.exception;


import com.xiesn.springboot.utils.ResponseCode;

/**
 * @Author: xiesn
 */
public class CustomLogicException extends CustomException {


    public CustomLogicException(String msg) {
        this(ResponseCode.WSLG_SYSTEM_HITS.getCode(), ResponseCode.WSLG_SYSTEM_HITS.formatResponseMessage(msg));
    }

    public CustomLogicException(int code, String msg) {
        super(code, msg);
    }

    public CustomLogicException(ResponseCode responseCode) {
        this(responseCode.getCode(), responseCode.getmsg());
    }

    public CustomLogicException(ResponseCode responseCode, String msg) {
        this(responseCode.getCode(), responseCode.formatResponseMessage(responseCode.getmsg(), msg));
    }

}
