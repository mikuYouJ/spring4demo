package com.sunmoongz.srping4.service.impl;

import com.sunmoongz.aop.Action;
import com.sunmoongz.srping4.service.FunctionService;
import com.sunmoongz.srping4.service.UseFunctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by G05326 on 2018/4/10.
 */
@Service("UseFunctionService")
public class UseFunctionServiceImpl  implements UseFunctionService{

    @Autowired
    private FunctionService functionService;

    public String sayHello(String word) {
        return functionService.sayHello(word);
    }
}
