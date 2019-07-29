package com.gexiao.demo.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @Auther: gexiao
 * @Date: 2019/7/26 11:13
 * @Description: JAVA7 for循环实现
 */
@Service
@Profile("Java7")
public class Java7CalculateService implements CalculateService {
    @Override
    public Integer sum(Integer... values) {
        System.out.println("java 7");
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum+=values[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        CalculateService service = new Java7CalculateService();
        Integer sum = service.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("1...10 sum total result "+sum);
    }
}
