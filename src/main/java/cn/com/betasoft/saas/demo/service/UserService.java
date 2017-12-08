package cn.com.betasoft.saas.demo.service;

import cn.com.betasoft.saas.demo.model.UserModel;

import java.util.List;

public interface UserService {
    public List<UserModel> selectAllUser();

    public UserModel selectUserById(String id);

    public void insertUser(UserModel user);

    public void deleteUserById(String id);

    public void updateUser(UserModel user);
}
