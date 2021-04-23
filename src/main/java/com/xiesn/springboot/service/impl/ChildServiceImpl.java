package com.xiesn.springboot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiesn.springboot.entity.Child;
import com.xiesn.springboot.mapper.ChildMapper;
import com.xiesn.springboot.service.IChildService;
import org.springframework.stereotype.Service;

/**
 * (Child)表服务实现类
 *
 * @author makejava
 * @since 2021-04-19 15:49:41
 */
@Service("childService")
public class ChildServiceImpl extends ServiceImpl<ChildMapper, Child> implements IChildService {

}
