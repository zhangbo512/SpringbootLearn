package com.example.demo.test;

import com.example.demo.aop.example.impl.HelloService;
import com.example.demo.aop.core.ProxyBean;
import com.example.demo.aop.example.impl.HelloServiceImpl;
import com.example.demo.aop.example.impl.MyInterceptor;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    @Autowired
    ObjectMapper objectMapper;

    @Test
    public void test01() {
        HelloService helloService = new HelloServiceImpl();
        HelloService proBean = (HelloService) ProxyBean.getProxyBean(helloService,new MyInterceptor());
        proBean.sayHello("你好");
    }



    @Test
    public void test02() {
        Properties properties = null;
        String str = "{\"jdbcUrl\":\"jdbc:mysql://192.168.11.200:7233/hdsp_core\",\"username\":\"hdsp_dev\",\"password\":\"02CF815CE1CE044583FDADFDB25CE3C2D1ABE696980D0B44\",\"defaultDatabase\":\"hdsp_core\"}";
        try {
            properties = objectMapper.readValue(str,Properties.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(properties);
    }

    @Test
    public void test03() {
        StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
        encryptor.setStringOutputType("hexadecimal");
        encryptor.setPassword("hUyhdphl2gXcBDEH5dy");
        String password = encryptor.decrypt("8BBF226C899CA05A7FF38880293D4B92C2DE5E816A1E63A5");
        System.out.println(password);
    }

    @Test
    public void test04() {
        // jdbc:hive2://192.168.11.223:10000/default;auth=noSasl
        String url = "jdbc:hive2://192.168.11.223:10000/default;auth=noSasl";
        String ipAndPort = url.split("//")[1].split("/")[0];
        String port = "";
        System.out.println(port);
        //isPassUrl("http://192.168.11.223:10000/default;auth=noSasl");
    }


    public boolean isPassUrl(String remoteLoginUrl) {
        boolean flag = false;
        String passUrlStr = "http://192.168.11.223:10000/default;auth=noSasl";
        Pattern p = Pattern
                .compile("[a-zA-Z0-9][-a-zA-Z0-9]{0,62}(\\.[a-zA-Z0-9][-a-zA-Z0-9]{0,62}|(:[0-9]{1,4}))+\\.?");
        Matcher matcher = p.matcher(remoteLoginUrl);

        if (passUrlStr.indexOf(matcher.group()) > -1) {
            flag = true;
        }
        return flag;
    }

}
