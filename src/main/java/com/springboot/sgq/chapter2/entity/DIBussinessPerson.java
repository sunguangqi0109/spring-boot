package com.springboot.sgq.chapter2.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DIBussinessPerson implements DIPerson {

    //byType 类型的注入
//    @Autowired
//    @Qualifier("DICat")
    private DIAnimal diAnimal = null;

//    public DIBussinessPerson(){}

    public DIBussinessPerson(@Autowired  @Qualifier("DIDog") DIAnimal diAnimal) {
        this.diAnimal = diAnimal;
    }

    @Override
    public void service() {
        this.diAnimal.use();
    }

    @Override
    public void setAnimal(DIAnimal dianimal) {
        this.diAnimal  = dianimal;
    }
}
