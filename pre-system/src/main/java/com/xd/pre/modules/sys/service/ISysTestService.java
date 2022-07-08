package com.xd.pre.modules.sys.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xd.pre.modules.sys.domain.SysRole;
import com.xd.pre.modules.sys.domain.SysTest;

import java.io.Serializable;
import java.util.List;

public interface ISysTestService extends IService<SysTest> {

    List<SysTest> selectTestList(String username);

    @Override
    boolean removeById(Serializable testid);

    @Override
    boolean  save(SysTest sysTest);

}
