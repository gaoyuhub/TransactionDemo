package com.person.yvan.controller;

import com.person.yvan.entity.User;
import com.person.yvan.service.UserService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;


    @Autowired
    private static Logger logger = LogManager.getLogger(UserController.class);

    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public @ResponseBody String getUser(@RequestParam(value = "id") Integer id){
        /*System.out.println("id:"+id);
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        String name = userService.getUserById(list);
        System.out.println(name);
        logger.info("name:"+name);*/

//        redis
        redisTemplate.opsForValue().set("name","tom");
        System.out.print(redisTemplate.opsForValue().get("name"));



        return "name";
    }



    @RequestMapping(value = "insert" , method = RequestMethod.GET)
    public @ResponseBody Integer insertUser(@RequestParam(value = "id") Integer id){
        System.out.println(333333);
        User user = new User();
        user.setId(9);
        user.setName("yva3");
        user.setAge(24);
        user.setSex(1);
        user.setAddress("123123123123");

        return userService.insertUser(user);
    }

    @RequestMapping(value = "insert2" , method = RequestMethod.GET)
    public @ResponseBody String insertUser2(@RequestParam(value = "id") Integer id){
        System.out.println(333333);
        User user = new User();
        user.setId(9);
        user.setName("yva3");
        user.setAge(24);
        user.setSex(1);
        user.setAddress("123123123123");
        userService.insertUser2(user);
        return "1";
    }

}
