package com.sunmoongz.srping4.service;

import com.sunmoongz.aop.Action;
import org.springframework.stereotype.Service;

/**
 * Created by G05326 on 2018/4/10.
 */


public interface FunctionService {
    @Action(name ="say hello")
    public String sayHello(String word);
}
