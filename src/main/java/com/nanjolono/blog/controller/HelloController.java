package com.nanjolono.blog.controller;

import com.nanjolono.blog.service.helloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    helloService helloService;
    @GetMapping("hello")
    public Object getHello(){
        return helloService.getSth();
    }

}
