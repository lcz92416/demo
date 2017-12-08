package cn.com.betasoft.saas.demo.dao;

import cn.com.betasoft.saas.demo.model.SysUserModel;

public interface SysUserDao {
    public SysUserModel findByUserName(String username);
}
