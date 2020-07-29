package com.springboot.sgq.chapter2.config;

import com.springboot.sgq.chapter2.entity.DIBussinessPerson;
import com.springboot.sgq.chapter2.entity.DIDog;
import com.springboot.sgq.chapter2.entity.DIPerson;
import com.springboot.sgq.chapter2.entity.User;
import org.apache.commons.dbcp2.BasicDataSourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration       //生成IOC 容器去装配bean
public class AppConfig {

    @Bean(name="user")      //将initUser 返回的pojo 装配到ioc 容器中    name=user作为bean 的名称放在ioc容器中
    public User initUser(){
        User user = new User();
//        user.setId(1L);
//        user.setUsername("sunguangqi");
//        user.setNote("是爸爸");
        return user;
    }

    //使用DBCP生成数据源
    @Bean(name = "dataSource")
    public DataSource getDataSource () {
        Properties props = new Properties();
        props.setProperty("driver", "com.mysql.jdbc.Driver");
        props.setProperty("url", "jdbc:mysql://localhost:3306/chapter3");
        props.setProperty("username", "root");
        props.setProperty("password", "123456");
        DataSource dataSource = null;
        try {
            dataSource = BasicDataSourceFactory.createDataSource(props);
        } catch (Exception e) {
            e.printStackTrace();
        }
            return dataSource;
    }

//    @Bean(name="dIBussinessPerson")
//    public DIBussinessPerson initDIBUssinessPerson(){
//        DIBussinessPerson diBussinessPerson = new DIBussinessPerson();
//        return diBussinessPerson;
//    }

    @Bean(name="dIPerson")
    public DIDog initDIPerson(){
        DIDog diPerson = new DIDog();
        return diPerson;
    }


}
