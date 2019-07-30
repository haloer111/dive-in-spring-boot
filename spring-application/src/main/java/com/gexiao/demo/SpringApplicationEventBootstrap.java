package com.gexiao.demo;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Auther: gexiao
 * @Date: 2019/7/29 16:04
 * @Description: Spring 应用事件引导类
 */
public class SpringApplicationEventBootstrap {

    public static void main(String[] args) {
        //创建上下文
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        //注册应用事件监听器
        context.addApplicationListener(event -> {
            System.out.println("监听到事件 : " + event);
        });

        // 启动上下文
        context.refresh();

        context.publishEvent("2019");

        context.publishEvent(new ApplicationEvent("HelloWorld"){});

        // 关闭上下文
        context.close();
    }


}
