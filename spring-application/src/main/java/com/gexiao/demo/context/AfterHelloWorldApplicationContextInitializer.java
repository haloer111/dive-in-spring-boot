package com.gexiao.demo.context;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.Ordered;

/**
 * @Auther: gexiao
 * @Date: 2019/7/29 17:27
 * @Description: AfterHelloWorldApplicationContextInitializer
 */
public class AfterHelloWorldApplicationContextInitializer implements ApplicationContextInitializer,Ordered {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        System.out.println("After ConfigurableApplicationContext.id = "+ applicationContext.getId());
    }

    @Override
    public int getOrder() {
        return Ordered.LOWEST_PRECEDENCE;
    }
}
