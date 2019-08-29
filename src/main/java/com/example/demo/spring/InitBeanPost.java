package com.example.demo.spring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 对所有Bean的前置和后置处理
 * </p>
 *
 * @author BO.ZHANG04@hand-china.com 2018/06/07 13:48
 */
@Slf4j
@Component
public class InitBeanPost implements InstantiationAwareBeanPostProcessor {

    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        log.info("---------postProcessBeforeInstantiation,{}",beanClass);
        return null;
    }


    @Override
    public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info("-----------postProcessAfterInitialization,{}",beanName);
        return null;
    }

}
