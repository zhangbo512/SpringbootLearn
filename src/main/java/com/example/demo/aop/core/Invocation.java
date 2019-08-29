package com.example.demo.aop.core;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * <p>
 * description
 * </p>
 *
 * @author KayTin 2018/06/07 13:48
 */
public class Invocation {
    private Object target;
    private Method method;
    private Object[] params;

    public Invocation(Object target, Method method, Object[] params) {
        this.target = target;
        this.method = method;
        this.params = params;
    }

    /**
     * 真实方法调用
     *
     * @return
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     */
    public Object process() throws InvocationTargetException, IllegalAccessException {
        return method.invoke(target,params);
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }

    public Object[] getParams() {
        return params;
    }

    public void setParams(Object[] params) {
        this.params = params;
    }
}
