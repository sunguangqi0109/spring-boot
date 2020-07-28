package com.springboot.sgq.chapter2.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DIBussinessPerson implements DIPerson {

    @Autowired          //byType 类型的注入
    private DIAnimal diAnimal = null;

    @Override
    public void service() {
        this.diAnimal.use();
    }

    @Override
    public void setAnimal(DIAnimal dianimal) {
        this.diAnimal  = dianimal;
    }
}
