package com.lening.mybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lening.mybatisplus.entity.UserBean;

/**
 * 通用mapper的时候，我们继承了Mapper接口
 * mybatis-plus我们继承的是basemapper
 */
public interface UserMapper extends BaseMapper<UserBean> {
}
