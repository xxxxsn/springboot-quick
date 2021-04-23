package com.xiesn.springboot.controller;


import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.api.R;
import com.xiesn.springboot.entity.Adult;
import com.xiesn.springboot.service.IAdultService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xiesn
 * @since 2021-04-15
 */
@RequestMapping("/adult")
@Api(tags = "地域服务")
@RestController
@RequiredArgsConstructor
public class AdultController {


    private final IAdultService adultService;

    @ApiOperation(value = "根据名称查", notes = "根据名称查")
    @GetMapping("/get")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "name", required = true)
    })
    public R get(String name) {
        List<Adult> adultList = adultService.list(Wrappers.<Adult>lambdaQuery().eq(Adult::getChilName, name));
        return R.ok(adultList);
    }

}
