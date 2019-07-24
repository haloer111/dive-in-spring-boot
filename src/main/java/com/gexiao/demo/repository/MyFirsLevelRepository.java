package com.gexiao.demo.repository;

import com.gexiao.demo.annotation.SecondLevelRepository;

/**
 * @Auther: gexiao
 * @Date: 2019/7/24 15:25
 * @Description:
 */
@SecondLevelRepository(value = "myFirsLevelRepository")
//@Component(value = "myFirsLevelRepository")
public class MyFirsLevelRepository {
}
