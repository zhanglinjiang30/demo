package com.example.demo.pojo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DemoDto {

    private String name;

    private int age;

    private int num1;

    private int num2;

    public DemoDto ces(DemoDto demoDto){
        System.out.println("age:"+demoDto.getAge());
        if(demoDto.getAge()==11) {
            demoDto.setAge(10);
        }
        return demoDto;
    }
}
