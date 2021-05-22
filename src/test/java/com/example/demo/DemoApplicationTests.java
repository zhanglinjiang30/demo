package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Enumeration;
import java.util.concurrent.ConcurrentHashMap;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
        ConcurrentHashMap<String,Object> map = new ConcurrentHashMap<String,Object>();
        Enumeration<String> keys = map.keys();
//        for(String key : keys){
//
//        }
    }

}
