package cn.com.betasoft.saas.demo.service.impl;

import cn.com.betasoft.saas.demo.dao.UserDao;
import cn.com.betasoft.saas.demo.mapper.mysql.UserByMySqlMapper;
import cn.com.betasoft.saas.demo.model.UserModel;
import cn.com.betasoft.saas.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserByMySqlMapper userMapper;

    @Override
    public List<UserModel> selectAllUser(){
        return userMapper.selectAllUser();
    }

    @Override
    public UserModel selectUserById(String id){
        return userMapper.selectUserById(id);
    }

    @Override
    public void insertUser(UserModel user){
        userMapper.insertUser(user);
    }

    @Override
    public void deleteUserById(String id){
        userMapper.deleteUserById(id);
    }

    @Override
    public void updateUser(UserModel user){
        userMapper.updateUser(user);
    }
}
