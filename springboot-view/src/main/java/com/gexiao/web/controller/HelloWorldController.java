package com.gexiao.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 * @Auther: gexiao
 * @Date: 2019/8/7 14:40
 * @Description: HelloWorld {@link org.springframework.stereotype.Controller}
 */
@Controller
public class HelloWorldController {

    @GetMapping("")
    public String helloWorld() {
        return "hello-world"; //view 逻辑名称
    }


    @ModelAttribute
    public String message(){
        return "helloworld";
    }
}
