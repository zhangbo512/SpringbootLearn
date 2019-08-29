package com.example.demo;

import com.example.demo.config.AppConfig;
import com.example.demo.domain.Dog;
import com.example.demo.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
@SpringBootApplication
public class SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        User user = applicationContext.getBean(User.class);
        Dog dog = applicationContext.getBean(Dog.class);
        log.info(dog.toString());
        //

    }

}
