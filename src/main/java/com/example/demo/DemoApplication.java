package com.example.demo;

import com.example.demo.pojo.DemoDto;
import com.example.demo.pojo.DemoVo;
import com.example.demo.pojo.Person;
import net.oschina.j2cache.CacheChannel;
import net.oschina.j2cache.J2Cache;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.BeanUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

@SpringBootApplication
@MapperScan("com.example.demo.dao")
public class DemoApplication {

    public static void main(String[] args) throws Exception {

//        //stream流测试
//        System.out.println("stream-------------------------->>>测试");
//        List<DemoDto> list=new ArrayList<>();
//        DemoDto demoDto=DemoDto.builder()
//                .age(11)
//                .name("张三")
//                .num1(10)
//                .num2(10)
//                .build();
//        System.out.println("demoDto对象数据------------------------>>>"+demoDto.toString());
//        DemoVo demoVo=new DemoVo();
//        BeanUtils.copyProperties(demoDto,demoVo);
//        System.out.println("demoVo对象数据------------------------>>>"+demoVo.toString());
//        DemoDto demoDto1=DemoDto.builder()
//                .age(22)
//                .name("张四")
//                .num1(20)
//                .num2(20)
//                .build();
//        list.add(demoDto);
//        list.add(demoDto1);
//        list.stream().forEach(demoDto2 -> demoDto2.setAge(1));
//        list.stream().map(demoDto :: ces).forEach(System.out :: println);
//        System.out.println(LocalDateTime.now().plusHours(-1));
//
//        System.out.println("Convert-------->>>"+System.currentTimeMillis());
//        System.out.println(Base64.getEncoder().encodeToString("NhaoSoft!@#$%^Z&*.zxcvbnmasdfghjkqwertyuiop^^".getBytes(StandardCharsets.UTF_8)));
//
//        //序列化测试
//        System.out.println("序列化测试--------------------------->>>");
//        serializePerson();
//        Person p = deserializePerson();
//        System.out.println(p.getName()+";"+p.getAge());
        SpringApplication.run(DemoApplication.class, args);
//
//        //J2Cache缓存测试
//        System.out.println("J2Cache缓存测试--------------------------->>>");
//        CacheChannel cache = J2Cache.getChannel();
//
//        //缓存操作
//        cache.set("default", "1", "Hello J2Cache");
//        System.out.println(cache.get("default", "1").getValue());
////        cache.evict("default", "1");
////        System.out.println(cache.get("default", "1"));
//
//        cache.close();

        //算法题
        //古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？ //这是一个菲波拉契数列问题
        for(int i=1;i<=20;i++){//假如20个月
            System.out.println("第"+i+"个月，兔子的数量："+tuzi(i));
        }


    }

    private static void serializePerson() throws FileNotFoundException,IOException {
        Person person = Person.builder()
                .id(1L)
                .gender("男")
                .name("张三")
                .age("120")
                .build();

        ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream(
                new File("E:/person.txt")));
        oo.writeObject(person);
        System.out.println("序列化成功");
        oo.close();
    }

    private static Person deserializePerson() throws IOException, Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("E:/person.txt")));
        Person person = (Person) ois.readObject();
        System.out.println("反序列化成功");
        return person;
    }

    public static int tuzi(int i){
        if(i==1 || i==2){
            return 1;
        }
        return tuzi(i-1)+tuzi(i-2);
    }
}
