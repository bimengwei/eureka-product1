package com.baizhi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class TestProduct {
    @RequestMapping("/product")
    public String getProduct(String name){
        return "hello 2节点"+name;
    }
}
