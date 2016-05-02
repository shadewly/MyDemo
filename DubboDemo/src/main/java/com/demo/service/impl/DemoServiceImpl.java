package com.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.demo.service.DemoService;

/**
 * Created by Wang Linyong on 2016/4/28.
 */

@Service(version = "1.0.0")
public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        return "Hello " + name;
    }
}