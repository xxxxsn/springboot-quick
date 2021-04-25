package com.xiesn.springboot;

import cn.hutool.crypto.SecureUtil;
import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xiesn.springboot.entity.Adult;
import com.xiesn.springboot.mapper.AdultMapper;
import com.xiesn.springboot.service.IAdultService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ApplicationTests {


    @Autowired
    IAdultService adultService;

    @Autowired
    AdultMapper adultMapper;

    @Test
    public void getByid() {
        Integer integer = adultMapper.selectCount(Wrappers.emptyWrapper());
        System.err.println(integer);
    }


    @Test
    public void page() {
        IPage<Adult> iPage = adultMapper.selectPage(new Page<>(1, 10),
                Wrappers.<Adult>lambdaQuery().eq(Adult::getChilSex, 1));
        System.err.println(JSON.toJSONString(iPage));
    }

    @Test
    public  void test() {
        String sid = "{\" Appkey\":\"Noslu4rOPPV1lEFj\",\" AppSecret\":\"RSQ#unyMBOohXZdF8c9sF!CKO$RFvb8E\"}";
//         * AES加密：aes().encrypt(data)
//         * AES解密：aes().decrypt(data)
        String data = SecureUtil.aes().encryptHex(sid,"XclgZZ2ga72gqvJR");
        System.err.println(data);
    }


    @Test
    public void testCache() {
        adultService.selectListByName("周涛");
    }

}
