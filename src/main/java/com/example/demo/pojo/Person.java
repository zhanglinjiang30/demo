package com.example.demo.pojo;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class Person implements Serializable {

    private static final long SerialVersionUID= -1085554436206732125L;

    private Long id;

    private String name;

    private String age;

    private String gender;

    private String ces;
}
