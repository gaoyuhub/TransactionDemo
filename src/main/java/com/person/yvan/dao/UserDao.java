package com.person.yvan.dao;

import com.person.yvan.entity.User;

import java.util.Map;

public interface UserDao {



     String selectUserById(int id);

     int updateName(Map<String,Object> map);

     int insertUser(User user);

}
