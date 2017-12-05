package cn.com.betasoft.saas.demo.dao;

import cn.com.betasoft.saas.demo.model.UserModel;

import java.util.List;

public interface UserDao {
    public List<UserModel> selectAllUser();

    public UserModel selectUserById(String id);
}
