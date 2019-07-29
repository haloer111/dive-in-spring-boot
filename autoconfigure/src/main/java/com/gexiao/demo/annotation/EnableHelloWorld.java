package com.gexiao.demo.annotation;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @Auther: gexiao
 * @Date: 2019/7/25 15:48
 * @Description:
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
//@Import(HelloWorldConfiguration.class)
@Import(HelloWorldImportSelector.class)
public @interface EnableHelloWorld {
}
