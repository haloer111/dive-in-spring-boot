package com.gexiao.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Auther: gexiao
 * @Date: 2019/7/30 15:16
 * @Description: HelloWorld {@link Controller}
 */
@Controller
public class HelloWorldController {

    @RequestMapping("")
    public String index(@RequestParam int value, Model model) {
//        使用对应的 {@link HelloWorldControllerAdvice} 来处理
//        model.addAttribute("message", "Hello,World");
//        model.addAttribute("acceptLanguage", acceptLanguage);
//        model.addAttribute("jsessionId", jsessionId);
//        model.addAttribute("value", value);
        return "index";
    }


}
