package com.example.demo.config;

import com.example.demo.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * <p>
 * 配置类
 * </p>
 *
 * @author KayTin 2018/06/07 13:48
 */
@Configuration
@ComponentScan("com.example.demo.domain")
@ImportResource(value = {"classpath:spring-other.xml"})
public class AppConfig {
    @Bean
    public User initUser() {
      return new User();
  }
}
