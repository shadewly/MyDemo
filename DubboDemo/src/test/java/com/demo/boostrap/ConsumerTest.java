package com.demo.boostrap;

import com.alibaba.dubbo.config.annotation.Reference;
import com.demo.service.DemoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Wang Linyong on 2016/4/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:consumer.xml")
public class ConsumerTest {
//    @Reference(version = "1.0.0")
    private DemoService demoService;

    @Test
    public void helloTest() {
        int i = 0;
        for (; i < 10; i++) {
            Long t = System.currentTimeMillis();
            String result = demoService.sayHello("World" + i);
            System.out.println(result);
//        result = helloService.handShake("Li lei" + i);
//        System.out.println(result);
            System.out.println("===>time cost>" + (System.currentTimeMillis() - t));
        }
    }

}
