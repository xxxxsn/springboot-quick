package com.xiesn.springboot.utils;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * FileName: ResponseCode
 * Author:  xiesn
 *
 * @author xiesn
 */
@ApiModel(value = "返回类")
public class ResultData<T> implements Serializable {

    private static final long serialVersionUID = 3084870483677717066L;

    /**
     * 响应结果
     */
    @ApiModelProperty("响应结果")
    private T data;

    /**
     * 返回信息
     */
    @ApiModelProperty("返回信息")
    private String msg;

    /**
     * 返回码
     */
    @ApiModelProperty("返回码")
    private int code;

    public ResultData() {

    }

    public ResultData(T data) {
        this.data = data;
    }

    public ResultData(T data, ResponseCode resCode) {
        this(resCode);
        this.data = data;
    }

    public ResultData(ResponseCode resCode) {
        this.msg = resCode.getmsg();
        this.code = resCode.getCode();
    }


    public ResultData(int retCode, String msg) {
        super();
        this.msg = msg;
        this.code = retCode;
    }

    public ResultData(T data, int retCode, String msg) {
        super();
        this.data = data;
        this.msg = msg;
        this.code = retCode;
    }

    public Boolean isOK() {
        return this.code == 200;
    }

    public T getData() {
        return data;
    }


    public String getMsg() {
        return msg;
    }

    public int getIsOk() {
        return code;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setIsOk(int isOk) {
        this.code = isOk;
    }

    @Override
    public String toString() {
        return "ResultData{" +
                "data=" + data +
                ", msg='" + msg + '\'' +
                ", code=" + code +
                '}';
    }
}