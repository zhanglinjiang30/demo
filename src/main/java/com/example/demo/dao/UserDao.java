package com.example.demo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
//�û�ʵ����
public interface UserDao extends BaseMapper<User>{

    void addUser(@Param("user") User user);
}
