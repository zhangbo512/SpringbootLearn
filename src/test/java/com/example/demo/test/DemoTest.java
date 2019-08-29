package com.example.demo.test;

import com.example.demo.aop.example.impl.HelloService;
import com.example.demo.aop.core.ProxyBean;
import com.example.demo.aop.example.impl.HelloServiceImpl;
import com.example.demo.aop.example.impl.MyInterceptor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * <p>
 * description
 * </p>
 *
 * @author KayTin 2018/06/07 13:48
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoTest {
    @Test
    public void test01() {
        HelloService helloService = new HelloServiceImpl();
        HelloService proBean = (HelloService) ProxyBean.getProxyBean(helloService,new MyInterceptor());
        proBean.sayHello("你好");
    }
}
