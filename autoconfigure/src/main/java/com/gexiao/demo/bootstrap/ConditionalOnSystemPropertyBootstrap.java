package com.gexiao.demo.bootstrap;

import com.gexiao.demo.condition.ConditionalOnSystemProperty;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * @Auther: gexiao
 * @Date: 2019/7/26 15:52
 * @Description: 系统属性条件引导类
 */
public class ConditionalOnSystemPropertyBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(ConditionalOnSystemPropertyBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        String hellWorld = context.getBean("hellWorld", String.class);

        System.out.println("hellWorld = " + hellWorld);

        context.close();
    }

    @Bean
    @ConditionalOnSystemProperty(name = "user.name",value = "Mercy")
    public String hellWorld(){
        return "Hello,World 小马哥";
    }
}
