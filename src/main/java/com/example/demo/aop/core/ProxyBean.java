package com.example.demo.aop.core;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * <p>
 * description
 * </p>
 *
 * @author KayTin 2018/06/07 13:48
 */
public class ProxyBean implements InvocationHandler {

    /**
     * 拦截器
     */
    private Interceptor interceptor;

    /**
     * 代理对象
     */
    private Object target;

    /**
     * 获取代理对象
     * @param target
     * @param interceptor
     * @return
     */
    public static Object getProxyBean(Object target, Interceptor interceptor) {
        ProxyBean proxyBean = new ProxyBean();
        proxyBean.target = target;
        proxyBean.interceptor = interceptor;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),proxyBean);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Invocation invocation = new Invocation(this.target,method,args);
        Object result = null;
        // 前置
        this.interceptor.before();
        try {
            if(this.interceptor.useAround()) {
                result = this.interceptor.around(invocation);
            } else {
                result = method.invoke(target,args);
            }
        } catch (Exception e) {
            this.interceptor.afterThrowExc(invocation,e);
        }

        // 后置
        this.interceptor.after(invocation);
        return result;
    }
}
