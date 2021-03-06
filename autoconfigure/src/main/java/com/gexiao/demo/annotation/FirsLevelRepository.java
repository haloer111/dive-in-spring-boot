package com.gexiao.demo.annotation;

import org.springframework.stereotype.Repository;

import java.lang.annotation.*;

/**
 * @Auther: gexiao
 * @Date: 2019/7/24 15:21
 * @Description: 一级 {@link Repository @Repository}
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Repository
public @interface FirsLevelRepository {
    String value() default "";
}
