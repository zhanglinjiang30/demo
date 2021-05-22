package com.example.demo.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.dao.MsLaborMapper;
import com.example.demo.pojo.MsLabor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/taskss")
@RestController
public class TaskController {

    @Autowired
    MsLaborMapper msLaborMapper;

    @GetMapping("/getTasks")
    @ResponseBody
    public Object listTasks(){
        QueryWrapper<MsLabor> msLaborQueryWrapper=new QueryWrapper<>();
        msLaborQueryWrapper.lambda().eq(MsLabor::getUfaceId,"16E3A2F73FF140CDAF35048F40127E79");
        MsLabor msLabor=msLaborMapper.selectOne(msLaborQueryWrapper);
        return msLabor;
    }

    @GetMapping("/getNewTasks")
    public String newTasks(){
        return "创建了一个新的任务";
    }
}
