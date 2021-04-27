package com.xiesn.springboot.controller;


import com.xiesn.springboot.entity.Adult;
import com.xiesn.springboot.entity.vo.StudentVo;
import com.xiesn.springboot.service.IAdultService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import net.dreamlu.mica.core.result.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * @author xiesn
 * @since 2021-04-15
 */
@RequestMapping("/adult")
@Api(tags = "成人接口")
@RestController
@RequiredArgsConstructor
public class AdultController {


    private final IAdultService adultService;

    @ApiOperation(value = "根据名称查", notes = "根据名称查")
    @PostMapping("/post")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "name", required = true)
    })
    //限流注解
   //@RateLimiter(value="/adult/get",max=2L,timeUnit = TimeUnit.SECONDS)
    public R get(String name ) {
        List<Adult> adultList = adultService.selectListByName(name);
        return R.success(adultList);
    }


    @ApiOperation(value = "脱敏数据测试", notes = "脱敏数据测试")
    @GetMapping("/tm")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "name", required = true)
    })
    public R tm() {

        List<StudentVo> adultVos = Arrays.asList(
                new StudentVo("610582199101166526","张三"),
                new StudentVo("612182199101166526","张三"),
                new StudentVo("620582199101166526","王文子"),
                new StudentVo("310582199101166526","赵艳思"));
        return R.success(adultVos);
    }




}
