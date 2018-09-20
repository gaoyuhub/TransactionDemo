package com.person.yvan.service.impl;

import com.person.yvan.dao.UserDao;
import com.person.yvan.entity.User;
import com.person.yvan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;


    static int a;

    @Autowired
    private TransactionTemplate transactionTemplate;

    @Override
    public String getUserById(List<Integer> list) {
        Map<String,Object> map = new HashMap<String,Object>();
        int i = 0;
        for(Integer id:list){
            map.put("id",id);
            if(id == 1){
                map.put("name","fff");
            }else{
                map.put("name","abcdefg");
            }

            i += userDao.updateName(map);
        }

        String a = i + "";
        return a;
    }


    public Integer insertUser(final User user){

        Integer i = (Integer) this.transactionTemplate.execute(new TransactionCallback() {

            public Object doInTransaction(TransactionStatus transactionStatus){
                Integer i = userDao.insertUser(user);
                if(i>0){
                    System.out.println("success");
                }

                int j = 10/0;
                return i;
            }

        });

        return i;
    }

    @Transactional
    public void insertUser2(final User user){

/*        int i = userDao.insertUser(user);
        if (i>0){
            System.out.println("success");
        }

        int j = 10/5;*/

        a = 3;
        try {
            int j = 10/0;
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
