package com.gexiao.demo.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.Ordered;

/**
 * @Auther: gexiao
 * @Date: 2019/7/30 09:27
 * @Description: After HelloWorld {@link ApplicationListener} 监听 {@link ContextRefreshedEvent}
 */

public class AfterHelloWorldApplicationListener implements ApplicationListener<ContextRefreshedEvent>, Ordered {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println(" After HelloWorld " + event.getApplicationContext().getId() + " , timestamp : " + event.getTimestamp());

    }

    @Override
    public int getOrder() {
        return Ordered.LOWEST_PRECEDENCE;
    }
}
