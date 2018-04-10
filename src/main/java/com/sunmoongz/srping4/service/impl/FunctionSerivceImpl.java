package com.sunmoongz.srping4.service.impl;

import com.sunmoongz.srping4.service.FunctionService;
import org.springframework.stereotype.Service;

/**
 * Created by G05326 on 2018/4/10.
 */
@Service("FunctionService")
public class FunctionSerivceImpl implements FunctionService {
    public String sayHello(String word) {
        return "hello !" + word ;
    }
}
