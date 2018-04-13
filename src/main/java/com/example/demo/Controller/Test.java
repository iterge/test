package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/4/13.
 */
@RestController
public class Test {
    @RequestMapping("test")
    public String test(){
        System.out.println("idea System.out.println的快捷键是sout");
        return "test";
    }
}
