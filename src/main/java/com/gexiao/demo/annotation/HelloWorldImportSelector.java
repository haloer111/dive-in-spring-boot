package com.gexiao.demo.annotation;

import com.gexiao.demo.configuration.HelloWorldConfiguration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Auther: gexiao
 * @Date: 2019/7/25 16:01
 * @Description: HelloWorld {@link org.springframework.context.annotation.ImportSelector} 实现
 */
public class HelloWorldImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{HelloWorldConfiguration.class.getName()};
    }
}
