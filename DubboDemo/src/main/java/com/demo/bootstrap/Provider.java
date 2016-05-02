package com.demo.bootstrap;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Wang Linyong on 2016/4/28.
 */
public class Provider {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
        context.start();
        System.in.read(); // 按任意键退出
    }

}