package com.service;

import service.JavaSpiService;

/**
 * @auther: User
 * @Date: 2020/1/19 23:10
 * @Description:
 */
public class JavaSpiService2Impl implements JavaSpiService {
    @Override
    public void sayHello() {
        System.out.println("=== service2 ====");
    }
}
