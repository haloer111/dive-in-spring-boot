package com.gexiao.demo.configuration;

import com.gexiao.demo.annotation.EnableHelloWorld;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: gexiao
 * @Date: 2019/7/25 15:52
 * @Description: helloworld 自动装配
 */
@Configuration
@EnableHelloWorld //spring @enable 模块装配
//@ConditionalOnSystemProperty(name = "user.name",value = "Mercy")
public class HelloWorldAutoConfiguration {


}
