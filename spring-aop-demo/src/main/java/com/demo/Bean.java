package com.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by Wang Linyong on 2016/7/20.
 */
@Component
public class Bean {
    private static final Logger log = LoggerFactory.getLogger(Bean.class);

    @ProfileExecution
    public void foo() {
        log.info("Executing method 'foo'.");
    }

}
