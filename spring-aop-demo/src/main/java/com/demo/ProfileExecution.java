package com.demo;

import java.lang.annotation.*;

/**
 * Created by Wang Linyong on 2016/7/20.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Inherited
@Documented
public @interface ProfileExecution {

}
