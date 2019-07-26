package com.gexiao.demo.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

/**
 * @Auther: gexiao
 * @Date: 2019/7/26 11:13
 * @Description: JAVA7 for循环实现
 */
@Service
@Profile("Java8")
public class Java8CalculateService implements CalculateService {
    @Override
    public Integer sum(Integer... values) {
        System.out.println("java 8");
        return Stream.of(values).reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        CalculateService service = new Java8CalculateService();
        Integer sum = service.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("1...10 sum total result "+sum);
    }
}
