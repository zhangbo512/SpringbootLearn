package com.example.demo.aop.example.impl;

/**
 * <p>
 * description
 * </p>
 *
 * @author BO.ZHANG04@hand-china.com 2018/06/07 13:48
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public void sayHello(String message) {
        System.out.println("-------"+message);
    }
}
