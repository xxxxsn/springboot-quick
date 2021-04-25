package com.xiesn.springboot.service.impl;


import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiesn.springboot.constant.ConstantDefine;
import com.xiesn.springboot.entity.Adult;
import com.xiesn.springboot.mapper.AdultMapper;
import com.xiesn.springboot.service.IAdultService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xiesn
 * @since 2021-04-15
 */
@Service
public class AdultServiceImpl extends ServiceImpl<AdultMapper, Adult> implements IAdultService {

    @Override
    @Cacheable(value = ConstantDefine.CacheConstant.ADULT_KEY+"#50s", key = "#name")
    public List<Adult> selectListByName(String name) {
        List<Adult> adults = baseMapper.selectList(Wrappers.<Adult>lambdaQuery().eq(Adult::getChilName, name));
        return adults;
    }


}
