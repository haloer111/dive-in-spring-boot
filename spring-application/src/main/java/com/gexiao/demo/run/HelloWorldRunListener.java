package com.gexiao.demo.run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @Auther: gexiao
 * @Date: 2019/7/30 11:02
 * @Description: HelloWorld {@link SpringApplicationRunListener}
 */
public class HelloWorldRunListener implements SpringApplicationRunListener {


    public HelloWorldRunListener(SpringApplication application, String[] args){

    }

    @Override
    public void starting() {
        System.out.println("HelloWorldRunListener.starting()");
    }

    @Override
    public void environmentPrepared(ConfigurableEnvironment environment) {

    }

    @Override
    public void contextPrepared(ConfigurableApplicationContext context) {

    }

    @Override
    public void contextLoaded(ConfigurableApplicationContext context) {

    }

    @Override
    public void started(ConfigurableApplicationContext context) {

    }

    @Override
    public void running(ConfigurableApplicationContext context) {

    }

    @Override
    public void failed(ConfigurableApplicationContext context, Throwable exception) {

    }
}
