package com.example.demo.domain;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * <p>
 * description
 * </p>
 *
 * @author BO.ZHANG04@hand-china.com 2018/06/07 13:48
 */
@Slf4j
public class AdvancedBean implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean {
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        log.info("--------setBeanFactory,{}");
    }

    @Override
    public void setBeanName(String s) {

    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }
}
