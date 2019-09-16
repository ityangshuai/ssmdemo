package com.ityangshuai.service.business.core;

import com.ityangshuai.domain.SysUser;
import com.ityangshuai.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoServiceBusi {

    @Autowired
    private SysUserService sysUserService;

    public List<SysUser> findAll(){
        return sysUserService.findAll();
    }


}
