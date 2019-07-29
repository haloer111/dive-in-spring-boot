package com.gexiao.demo.condition;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * @Auther: gexiao
 * @Date: 2019/7/26 15:42
 * @Description: java 系统属性 条件判断
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@Documented
@Conditional(OnSystemPropertyCondition.class)
public @interface ConditionalOnSystemProperty {

    /**
     * Java 系统属性名称
     * @return
     */
    String name();

    /**
     * Java 系统属性值
     * @return
     */
    String value();
}
