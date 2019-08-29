package com.example.demo.domain;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

/**
 * <p>
 * description
 * </p>
 *
 * @author BO.ZHANG04@hand-china.com 2018/06/07 13:48
 */
@Scope(WebApplicationContext.SCOPE_SESSION)
@Component
public class UserInfo {
}
