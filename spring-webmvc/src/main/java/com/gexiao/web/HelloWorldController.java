package com.gexiao.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: gexiao
 * @Date: 2019/7/30 15:16
 * @Description: HelloWorld {@link Controller}
 */
@Controller
public class HelloWorldController {

    @RequestMapping("")
    public String index(@RequestHeader("Accept-Language") String acceptLanguage,
                        @CookieValue("JSESSIONID") String jsessionId,
                        Model model) {
//        model.addAttribute("message", "Hello,World");
        model.addAttribute("acceptLanguage", acceptLanguage);
        model.addAttribute("jsessionId", jsessionId);
        return "index";
    }

    @ModelAttribute("message")
    public String message() {
        return "Hello,World";
    }
}
