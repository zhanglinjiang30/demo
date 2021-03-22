package com.example.demo.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("t_user")
public class User implements Serializable {

    private final static long serialVersionUID=1L;

    private Long id;

    private String username;

    private String password;

    private String role;

}
