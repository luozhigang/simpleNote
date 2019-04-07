package com.lzg.provider.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.lzg.core.po.UserPO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author gage
 * @Date
 *
 */
@Mapper
public interface UserMapper extends BaseMapper<UserPO> {
}
