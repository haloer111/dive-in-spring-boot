package com.gexiao.demo.context;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * @Auther: gexiao
 * @Date: 2019/7/29 17:27
 * @Description:
 */
@Order(Ordered.HIGHEST_PRECEDENCE)
public class HelloWorldApplicationContextInitializer<C extends ConfigurableApplicationContext>
                implements ApplicationContextInitializer<C> {
    @Override
    public void initialize(C applicationContext) {
        System.out.println("ConfigurableApplicationContext.id = " + applicationContext.getId());
    }
}
