package com.springboot.sgq.chapter2.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component          //自动装配，优先级高于AppConfig
public class User {

    @Value("2")
    private Long id;
    @Value("wjk")
    private String username;
    @Value("wjk alg")
    private String note;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
