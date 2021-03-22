package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.dao.UserDao;
import com.example.demo.pojo.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserDao,User> implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void addUser(User user) {
        user.setId(5L);
        userDao.insert(user);
//        List<String> arr=new ArrayList<>();
//        arr.add("123");
//        arr.add("acong");
//        List<User> users=this.list(Wrappers.<User>lambdaQuery()
//            .in(User::getName,arr)
//        );
//        queryWrapper.lambda().eq(User::getPassword,"123123");
//
//        List<User> users=this.list(queryWrapper);
//        users.stream().forEach(System.out::println);
    }
}
