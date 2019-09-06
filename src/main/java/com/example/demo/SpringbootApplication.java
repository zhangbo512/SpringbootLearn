package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author zb
 */
@Slf4j
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringbootApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(SpringbootApplication.class, args);
        } catch (Throwable e) {
            e.printStackTrace();
        }

        /*ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        User user = applicationContext.getBean(User.class);
        Dog dog = applicationContext.getBean(Dog.class);
        log.info(dog.toString());
        //*/

    }

}
