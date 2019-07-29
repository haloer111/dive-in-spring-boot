package com.gexiao.demo.bootstrap;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Auther: gexiao
 * @Date: 2019/7/24 15:26
 * @Description: {@link org.springframework.boot.autoconfigure.EnableAutoConfiguration} 引导类
 */
@EnableAutoConfiguration
public class EnableAutoConfigurationBootstrap {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(EnableAutoConfigurationBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        //MyFirsLevelRepository 是否存在
        String  helloWorld = (String) context.getBean("helloWorld");

        System.out.println("helloWorld Bean : "+helloWorld);

        //关闭上下文
        context.close();
    }

}