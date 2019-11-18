package com.fsd.eurekaclient;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @RequestMapping("getTeacher")
    public Map<String, Object> getTeacher(){
       
        Map<String, Object> map = new HashMap<String, Object>();
        List<String> list = new ArrayList<String>();
        list.add("Dana Katherine Scully");
        list.add("Fox William Mulder");
        list.add("John Jay Doggett");
        list.add("Monica Julieta Reyes");
        map.put("teacherList",list);
        
        return map;
    }
    
    @RequestMapping("getUser")
    public Map<String, Object> getUser(){
        System.out.println("微信小程序正在调用。。。");
        Map<String, Object> map = new HashMap<String, Object>();
        List<String> list = new ArrayList<String>();
        list.add("zhangsan");
        list.add("lisi");
        list.add("wanger");
        list.add("mazi");
        map.put("list",list);
        System.out.println("微信小程序调用完成。。。");
        return map;
    }
}

