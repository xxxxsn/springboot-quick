package com.xiesn.springboot.entity.vo;

import com.xiesn.springboot.sensitive.Sensitive;
import com.xiesn.springboot.sensitive.SensitiveTypeEnum;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StudentVo {


    @Sensitive(type = SensitiveTypeEnum.ID_CARD)
    private String cardId;


    @Sensitive(type = SensitiveTypeEnum.CHINESE_NAME)
    @ApiModelProperty(value = "名字")
    private String name;



}
