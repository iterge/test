package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/4/12.
 */
@RestController
public class Index {
    @RequestMapping("/")
    public String indexTest(){
        return "hello";
    }
    @RequestMapping("/index")
    public String hello(){
        return "Hello World !";
    }
}
