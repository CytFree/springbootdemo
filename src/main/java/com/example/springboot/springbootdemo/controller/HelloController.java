package com.example.springboot.springbootdemo.controller;

import com.example.springboot.springbootdemo.service.dubbo.consumer.PersonConsumerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CaoYangTao
 * @date 2018年05月05日 19:42
 * @desc
 */
@RestController
public class HelloController {
    @Autowired
    private PersonConsumerServiceImpl personConsumerService;

    @RequestMapping("testConsumerHello")
    public String hello() {
        return personConsumerService.getIdCard();
    }
}
