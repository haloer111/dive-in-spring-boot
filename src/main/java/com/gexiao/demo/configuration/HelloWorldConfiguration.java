package com.gexiao.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: gexiao
 * @Date: 2019/7/25 15:52
 * @Description:
 */
@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String helloWorld(){     //方法名即bean的名称
        return "Hello,world 2019";
    }
}
