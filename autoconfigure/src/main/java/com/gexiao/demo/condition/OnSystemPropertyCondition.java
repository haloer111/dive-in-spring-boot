package com.gexiao.demo.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.util.MultiValueMap;

/**
 * @Auther: gexiao
 * @Date: 2019/7/26 15:45
 * @Description:
 */
public class OnSystemPropertyCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {

        MultiValueMap<String, Object> attributes = metadata.getAllAnnotationAttributes(ConditionalOnSystemProperty.class.getName());

        String name = String.valueOf(attributes.get("name"));
        String value = String.valueOf(attributes.get("value"));

        String javaPropertyValue = System.getProperty(name);

        return name.equals(javaPropertyValue);


    }
}
