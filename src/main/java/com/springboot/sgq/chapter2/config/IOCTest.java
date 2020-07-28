package com.springboot.sgq.chapter2.config;

import com.springboot.sgq.chapter2.entity.Person;
import com.springboot.sgq.chapter2.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.apache.log4j.Logger;
public class IOCTest {

    private static Logger log= Logger.getLogger(IOCTest.class);
    public static void main (String [] args) {
        //将AppConfig 中的配置传递给AnnotationConfigApplicationContext的构造方法，就能读取配置了，
        //将配置里面的bean 装配到IOC容器中
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        //可以通过getBean 获取对应的POJO
        User user = ctx.getBean(User.class);
        log.info (user.getId());


        ApplicationContext ctx2 = new AnnotationConfigApplicationContext(AppConfigPerson.class);
        //可以通过getBean 获取对应的POJO
        Person person = ctx2.getBean(Person.class);
        log.info (person.getId());
    }

}
