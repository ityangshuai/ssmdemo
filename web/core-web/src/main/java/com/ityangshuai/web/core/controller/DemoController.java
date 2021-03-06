package com.ityangshuai.web.core.controller;

import com.ityangshuai.domain.SysUser;
import com.ityangshuai.service.business.core.DemoServiceBusi;
import com.ityangshuai.tool.spring.SpringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private DemoServiceBusi demoServiceBusi;

    @ResponseBody
    @RequestMapping("/findAll")
    public List<SysUser> findAll(){
        return demoServiceBusi.findAll();
    }


    @ResponseBody
    @RequestMapping("/findAll2")
    public List<SysUser> findAll2(){
        DemoServiceBusi bean = SpringUtil.getBean(demoServiceBusi.getClass());
        return bean.findAll();
    }




}
