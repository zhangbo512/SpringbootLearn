package com.example.demo.aop.core;


/**
 * <p>
 * 拦截器
 * </p>
 *
 * @author KayTin 2018/06/07 13:48
 */
public interface Interceptor {

    /**
     * 后置
     *
     * @return
     */
    void before();

    /**
     * 前置
     * @param invocation
     */
    void after(Invocation invocation);

    /**
     * 代替原有方法
     * @param invocation
     * @return
     */
    Object around(Invocation invocation) throws Exception;

    /**
     * 是否切入
     *
     * @return
     */
    boolean useAround();

    /**
     * 抛出异常
     *
     * @param invocation inv
     * @param e 异常
     */
    void afterThrowExc(Invocation invocation,Exception e);

    /**
     * 方法返回值处理
     * @return 方法返回值
     */
    Object afterReturn();

}
