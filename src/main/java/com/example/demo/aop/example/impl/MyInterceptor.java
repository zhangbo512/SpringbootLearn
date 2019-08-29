package com.example.demo.aop.example.impl;

import com.example.demo.aop.core.Invocation;
import com.example.demo.aop.core.Interceptor;
import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 * 拦截器实现
 * </p>
 *
 * @author KayTin 2018/06/07 13:48
 */
@Slf4j
public class MyInterceptor implements Interceptor {

    @Override
    public void before() {
        System.out.println("com.example.demo.aop.service.interceptor.impl.MyInterceptor.before");
    }

    @Override
    public void after(Invocation invocation) {
        System.out.println("com.example.demo.aop.service.interceptor.impl.MyInterceptor.after");
    }

    @Override
    public Object around(Invocation invocation) throws Exception{
        log.info("com.example.demo.aop.example.impl.MyInterceptor.around");
        invocation.process();
        int a = 3/0;
        return null;
    }

    @Override
    public boolean useAround() {
        return true;
    }

    @Override
    public void afterThrowExc(Invocation invocation,Exception e) {
        log.error("e:{}",e);
        System.out.println("com.example.demo.aop.service.interceptor.impl.MyInterceptor.afterThrowExc");
    }

    @Override
    public Object afterReturn() {
        return null;
    }
}
