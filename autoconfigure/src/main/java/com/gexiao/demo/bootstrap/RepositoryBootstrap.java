package com.gexiao.demo.bootstrap;

import com.gexiao.demo.repository.MyFirsLevelRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Auther: gexiao
 * @Date: 2019/7/24 15:26
 * @Description:
 */
@ComponentScan(basePackages = "com.gexiao.demo.repository")
public class RepositoryBootstrap {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(RepositoryBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        //MyFirsLevelRepository 是否存在
        MyFirsLevelRepository myFirsLevelRepository = (MyFirsLevelRepository) context.getBean("myFirsLevelRepository");

        System.out.println("myFirsLevelRepository Bean : "+myFirsLevelRepository);

        //关闭上下文
        context.close();
    }

}