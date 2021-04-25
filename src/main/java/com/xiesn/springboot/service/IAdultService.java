package com.xiesn.springboot.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.xiesn.springboot.entity.Adult;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xiesn
 * @since 2021-04-15
 */
public interface IAdultService extends IService<Adult> {

    List<Adult> selectListByName(String name);

}
