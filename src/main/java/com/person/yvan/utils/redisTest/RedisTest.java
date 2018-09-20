package com.person.yvan.utils.redisTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class RedisTest {


    @Autowired
    RedisTemplate redisTemplate;



    public static void main(String[] args){

    }


}
