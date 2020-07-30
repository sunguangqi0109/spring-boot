package com.springboot.sgq.chapter2.config;

import com.springboot.sgq.chapter2.entity.Person;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// lazyInit = true 延迟依赖注入     不加这个，ioc 容器初始化的时候，就执行了实例化和依赖注入
@Configuration
@ComponentScan(basePackages = {"com.springboot.sgq.chapter2.entity"},lazyInit = true) //指定要扫描的实体类的包，默认是当前所在包及其子包
//,excludeFilters = {@Filter(classes = {Service.class})})   //不自动装配被@Service 标注的类
//@ComponentScan(basePackageClasses = {Person.class})    //指定要扫描的实体类
public class AppConfigPerson {
    //就是不需要@Bean了
    public Person initPerson(){
//        Person person = new Person();
//        person.setId(33);
//        person.setName("person33");
//        return person;
        return  new Person();
    }


}
