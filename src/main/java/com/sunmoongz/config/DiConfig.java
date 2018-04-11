package com.sunmoongz.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by G05326 on 2018/4/10.
 */
@Configuration
@ComponentScan("com.sunmoongz")
@EnableAspectJAutoProxy
public class DiConfig {
}
