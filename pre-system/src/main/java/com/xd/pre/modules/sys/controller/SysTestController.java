package com.xd.pre.modules.sys.controller;

import com.xd.pre.common.utils.R;
import com.xd.pre.log.annotation.SysOperaLog;
import com.xd.pre.modules.sys.domain.SysTest;
import com.xd.pre.modules.sys.service.ISysTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class SysTestController {
    @Autowired
    private ISysTestService sysTestService;

    /**
     * 显示用户
     * @return
     */
        @GetMapping("/list")
        public R list(@RequestParam String username) {
            return R.ok(sysTestService.selectTestList(username));
        }

    /**
     * 删除用户
     * @param testid
     * @return
     */
    @SysOperaLog(descrption = "删除")
    @DeleteMapping("/{testid}")
    @PreAuthorize("hasAuthority('sys:test:del')")
    public R delete(@PathVariable("testid") Integer testid) {
        return R.ok(sysTestService.removeById(testid));
    }

    /**
     * 修改
     * @return
     */
    @SysOperaLog(descrption = "修改")
    @PutMapping
    @PreAuthorize("hasAuthority('sys:test:update')")
    public R updateById(@RequestBody SysTest sysTest) {
        return R.ok(sysTestService.updateById(sysTest));
    }
    /**
     * 增加
     */
    @SysOperaLog(descrption = "增加")
    @PostMapping
    @PreAuthorize("hasAuthority('sys:test:add')")
    public R save(@RequestBody SysTest sysTest) {
        return R.ok(sysTestService.save(sysTest));
    }

}
