package com.xiesn.springboot.utils;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author : chenjuntao
 * @version V1.0
 * @Project: common-service
 * @Package com.wslg.common.core
 * @Description: 带分页应答
 * @date Date : 2019年06月18日 5:16 PM
 */

@Data
@AllArgsConstructor
@ApiModel(value = "分页信息返回类")
public class ResultPageData<T> extends ResultData<T> {

    /**
     * 分页信息
     */
    @ApiModelProperty("分页信息")
    private PageInfo pageInfo;

    public ResultPageData(T data, PageInfo pageInfo, ResponseCode responseCode) {
        super(data, responseCode);
        this.pageInfo = pageInfo;
    }

    @Override
    public String toString() {
        return "ResultPageData{" +
                "pageInfo=" + pageInfo +
                "} " + super.toString();
    }
}
