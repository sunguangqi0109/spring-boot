package com.springboot.sgq.chapter2.entity;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)     //设置成IOC 容器每次获取一个bean 的时候，都会返回一个新的bean 的实例
public class ScopeBean {
}
