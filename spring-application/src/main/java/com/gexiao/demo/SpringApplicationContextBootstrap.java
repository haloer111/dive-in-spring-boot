package com.gexiao.demo;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Auther: gexiao
 * @Date: 2019/7/29 16:04
 * @Description: Spring 应用上下文 引导类
 */
@SpringBootApplication
public class SpringApplicationContextBootstrap {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new SpringApplicationBuilder(SpringApplicationContextBootstrap.class)
                .web(WebApplicationType.SERVLET)
                .run(args);

        System.out.println("ConfigurableApplicationContext 类型 : "+ context.getClass().getName());
        System.out.println("Environment 类型 : "+ context.getEnvironment().getClass().getName());

        context.close();
    }

    @SpringBootApplication
    public static class ApplicationConfiguration {

    }
}
