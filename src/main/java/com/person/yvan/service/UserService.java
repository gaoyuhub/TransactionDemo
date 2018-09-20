package com.person.yvan.service;

import com.person.yvan.entity.User;

import java.util.List;

public interface UserService {


     String getUserById(List<Integer> list);

     Integer insertUser(User user);

     void insertUser2(User user);
}
