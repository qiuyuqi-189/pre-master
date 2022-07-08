package com.xd.pre.modules.sys.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xd.pre.modules.sys.domain.SysTest;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * cs
 * qyq
 */
public interface SysTestMapper extends BaseMapper<SysTest> {

    @Select("SELECT * FROM sys_test WHERE username = ${username} ")
    List<SysTest> findIdTest(QueryWrapper<SysTest> username);
}
