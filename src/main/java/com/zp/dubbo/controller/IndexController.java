package com.zp.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zp.dubbo.IUserInterface;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zp
 * @create 2020/6/1 16:03
 */
@RestController
public class IndexController {

    @Reference
    private IUserInterface iUserInterface;

    @RequestMapping("/index")
    public String index(String name) {
        return iUserInterface.sayHello(name);
    }
}
