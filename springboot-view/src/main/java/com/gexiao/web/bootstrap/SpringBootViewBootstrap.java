package com.gexiao.web.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Auther: gexiao
 * @Date: 2019/8/7 17:17
 * @Description:
 */
@SpringBootApplication(scanBasePackages = "com.gexiao.web")
public class SpringBootViewBootstrap {

    public static void main(String[] args) {

        SpringApplication.run(SpringBootViewBootstrap.class,args);
    }
}
