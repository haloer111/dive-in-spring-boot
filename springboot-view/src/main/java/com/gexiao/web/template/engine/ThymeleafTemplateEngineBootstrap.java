package com.gexiao.web.template.engine;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring5.SpringTemplateEngine;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @Auther: gexiao
 * @Date: 2019/8/6 09:51
 * @Description: Thymeleaf 模板引导类
 */
public class ThymeleafTemplateEngineBootstrap {

    public static void main(String[] args) throws IOException {
        //构建引擎
        SpringTemplateEngine templateEngine = new SpringTemplateEngine();

        //创建渲染上下文
        Context context = new Context();
        context.setVariable("message","Hello,World");

        //读取内容从 classpath:/templates/thymeleaf/hello-world.html
        // ResourceLoader

        ResourceLoader resourceLoader = new DefaultResourceLoader();
        //通过 classpath:/templates/thymeleaf/hello-world.html
        Resource resource = resourceLoader.getResource("classpath:/templates/thymeleaf/hello-world.html");
        File templateFile = resource.getFile();
        //文件流
        FileInputStream fileInputStream = new FileInputStream(templateFile);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        //copy
        IOUtils.copy(fileInputStream,outputStream);

        fileInputStream.close();
        //模板的内容
//        String content = "<p th:text=\"${message}\">!!!</p>";
        String content = outputStream.toString(StandardCharsets.UTF_8.name());


        //渲染（处理）结果
        String result = templateEngine.process(content, context);
        //输出渲染（处理）结果
        System.out.println("result = " + result);
    }
}
