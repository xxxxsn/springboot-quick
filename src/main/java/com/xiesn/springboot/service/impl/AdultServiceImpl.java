package com.xiesn.springboot.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiesn.springboot.entity.Adult;
import com.xiesn.springboot.mapper.AdultMapper;
import com.xiesn.springboot.service.IAdultService;
import org.springframework.stereotype.Service;

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

}
