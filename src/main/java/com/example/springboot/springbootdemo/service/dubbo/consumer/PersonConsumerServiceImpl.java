package com.example.springboot.springbootdemo.service.dubbo.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cyt.service.demo.PersonService;
import org.springframework.stereotype.Component;

/**
 * @author CaoYangTao
 * @date 2018年05月07日 21:26
 * @desc
 */
@Component
public class PersonConsumerServiceImpl {
    @Reference(group = "dubbo", interfaceClass = PersonService.class, version = "1.0.0")
    private PersonService personService;

    public String getIdCard(){
        return personService.getIdCard();
    }
}
