package com.springboot.sgq.chapter2.entity;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary            //
public class DICat implements  DIAnimal {


    @Override
    public void use() {
        System.out.println("这是"+DICat.class.getSimpleName()+"发出的声音");
    }
}
