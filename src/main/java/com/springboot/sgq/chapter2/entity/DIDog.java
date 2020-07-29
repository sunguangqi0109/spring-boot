package com.springboot.sgq.chapter2.entity;

import org.springframework.stereotype.Component;

@Component
public class DIDog implements DIAnimal{

    @Override
    public void use() {
        System.out.println("这是"+DIDog.class.getSimpleName()+"发出的声音");    //得到类名称的简写
    }
}
