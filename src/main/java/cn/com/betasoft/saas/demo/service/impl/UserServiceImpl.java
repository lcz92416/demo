package cn.com.betasoft.saas.demo.service.impl;

import cn.com.betasoft.saas.demo.dao.UserDao;
import cn.com.betasoft.saas.demo.model.UserModel;
import cn.com.betasoft.saas.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    public List<UserModel> selectAllUser(){
        return userDao.selectAllUser();
    }

    public UserModel selectUserById(String id){
        return userDao.selectUserById(id);
    }
}
