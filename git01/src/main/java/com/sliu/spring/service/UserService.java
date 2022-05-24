package com.sliu.spring.service;

import com.sliu.spring.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
   @Autowired
    UserDao userDao;
    public void add(){
        System.out.println("service add");
        userDao.add();
    }
}
