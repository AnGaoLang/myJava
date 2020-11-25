package com.myjava.myjava.controller;

import com.myjava.myjava.config.MyConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
@EnableConfigurationProperties({MyConfig.class})
public class Example {
    @Value("${my.name}")
    private String name;
    @Value("${my.age}")
    private int age;

    @Autowired
    MyConfig myConfig;

    @RequestMapping("/hello")
    public String index() {
        System.out.println(myConfig.getGreeting());
        return myConfig.getGreeting()+" >>>>"+myConfig.getName()+" >>>>"+ myConfig.getUuid()+" >>>>"+myConfig.getMax();
    }
}
