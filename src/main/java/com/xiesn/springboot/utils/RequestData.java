package com.xiesn.springboot.utils;

import com.xiesn.springboot.exception.CustomLogicException;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Optional;


/**
 * @author chenjuntao
 */

@ApiModel("不带分页信息的请求入参")
public class RequestData<T> implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -2423424971495214211L;

    /**
     * 封装请求的入参
     */
    @ApiModelProperty("请求入参")
    private T params;


    public T getParams() {
        return params;
    }

    public void setParams(T params) {
        try {
            Optional.ofNullable(params).orElseThrow(() -> new CustomLogicException(ResponseCode.WSLG_INVALID_PARAMETERS));
        } catch (CustomLogicException e) {
            e.printStackTrace();
        }
        this.params = params;
    }

    public RequestData() {
    }

    public RequestData(T params) {
        this.params = params;
    }

    @Override
    public String toString() {
        return "RequestData{" +
                "params=" + params +
                '}';
    }
}