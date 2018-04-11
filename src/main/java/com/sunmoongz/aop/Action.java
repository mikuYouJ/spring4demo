package com.sunmoongz.aop;

import java.lang.annotation.*;

/**
 * Created by G05326 on 2018/4/11.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
