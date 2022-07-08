package com.xd.pre.modules.sys.service.impl;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xd.pre.modules.sys.domain.SysTest;
import com.xd.pre.modules.sys.mapper.SysTestMapper;
import com.xd.pre.modules.sys.service.ISysTestService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysTestServiceImpl extends ServiceImpl<SysTestMapper,SysTest> implements ISysTestService {


    @Override
    public List<SysTest> selectTestList(String username){
        LambdaQueryWrapper<SysTest> SysTestLambdaQueryWrapper = Wrappers.<SysTest>lambdaQuery();
        if (StrUtil.isNotEmpty(username)){
            SysTestLambdaQueryWrapper.like(SysTest::getUsername,username);
        }
        List<SysTest> SysTests = baseMapper.selectList(SysTestLambdaQueryWrapper);
        return SysTests;
    }
}
