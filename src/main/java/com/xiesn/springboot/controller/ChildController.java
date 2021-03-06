package com.xiesn.springboot.controller;

import cn.hutool.core.bean.BeanUtil;
import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.write.style.column.LongestMatchColumnWidthStyleStrategy;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xiesn.springboot.entity.Child;
import com.xiesn.springboot.entity.vo.ChildVo;
import com.xiesn.springboot.service.IChildService;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;
import java.util.stream.Collectors;

/**
 * (Child)表控制层
 */
@Controller
@RequestMapping("/child")
@Api(tags = "儿童接口")
@RequiredArgsConstructor
public class ChildController {



    public final IChildService childService;



    /**
     * 文件下载（失败了会返回一个有部分数据的Excel）
     */
    @GetMapping("/download")
    public void download(HttpServletResponse response) throws IOException {
        IPage<Child> iPage = childService.page(new Page<>(1, 50));
        List<Child> childList = iPage.getRecords();
        List<ChildVo> list = childList.stream().map(e -> {
            ChildVo childVo = BeanUtil.copyProperties(e, ChildVo.class);
            return childVo;
        }).collect(Collectors.toList());
        response.setContentType("application/vnd.ms-excel");
        response.setCharacterEncoding("utf-8");
        String fileName = URLEncoder.encode("测试", "UTF-8");
        response.setHeader("Content-disposition", "attachment;filename=" + fileName + ".xlsx");
        EasyExcel.write(response.getOutputStream(), ChildVo.class).sheet("模板")
                .registerWriteHandler(new LongestMatchColumnWidthStyleStrategy()).doWrite(list);
    }

}
