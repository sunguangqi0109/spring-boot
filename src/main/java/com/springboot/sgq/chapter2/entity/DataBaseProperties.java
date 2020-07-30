package com.springboot.sgq.chapter2.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")     //获取到配置文件中的值
public class DataBaseProperties {

    @Value("${database.driverName}")
    private String driverName = null;

    @Value("${database.url}")
    private String url = null;

    private String username = null;

    private String password = null;

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    @Value("${database.username}")
    public void setUsername(String username) {
        System.out.println(username);
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    @Value("${database.password}")
    public void setPassword(String password) {
        System.out.println(password);
        this.password = password;
    }
}
