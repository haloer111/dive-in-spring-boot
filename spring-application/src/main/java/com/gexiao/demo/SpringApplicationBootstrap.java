package com.gexiao.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.HashSet;
import java.util.Set;

/**
 * @Auther: gexiao
 * @Date: 2019/7/29 16:04
 * @Description: {@link SpringApplication 引导类}
 */
public class SpringApplicationBootstrap {

    public static void main(String[] args) {
//        SpringApplication.run(ApplicationConfiguration.class,args);

        Set<String> sources = new HashSet<>();
        // 配置class名称
        sources.add(ApplicationConfiguration.class.getName());

        SpringApplication  application = new SpringApplication();
        application.setSources(sources);
//        application.setWebApplicationType(WebApplicationType.NONE);
        ConfigurableApplicationContext context = application.run(args);
//
        ApplicationConfiguration bean = context.getBean(ApplicationConfiguration.class);

        System.out.println("bean = " + bean);
    }

    @SpringBootApplication
    public static class ApplicationConfiguration {

    }
}
