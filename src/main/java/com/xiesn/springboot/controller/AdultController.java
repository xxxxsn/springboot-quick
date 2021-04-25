package com.xiesn.springboot.controller;


import com.xiesn.springboot.entity.Adult;
import com.xiesn.springboot.service.IAdultService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import net.dreamlu.mica.core.result.R;
import net.dreamlu.mica.redis.ratelimiter.RateLimiter;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.TimeUnit;

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
    @PostMapping("/post")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "name", required = true)
    })
    @RateLimiter(value="/adult/get",max=2L,timeUnit = TimeUnit.SECONDS)
    public R get(String name ) {
        List<Adult> adultList = adultService.selectListByName(name);
        return R.success(adultList);
    }



}
