package com.gexiao.demo.bootstrap;

import com.gexiao.demo.service.CalculateService;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Auther: gexiao
 * @Date: 2019/7/26 11:12
 * @Description:
 */
@ComponentScan(basePackages = "com.gexiao.demo.service")
public class CalculateServiceBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(CalculateServiceBootstrap.class)
                .web(WebApplicationType.NONE)
                .profiles("Java8")
                .run(args);

        CalculateService bean = context.getBean(CalculateService.class);

        System.out.println("calculateService Bean : "+bean.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }
}
