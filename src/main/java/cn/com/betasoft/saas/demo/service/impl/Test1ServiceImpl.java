package cn.com.betasoft.saas.demo.service.impl;

import cn.com.betasoft.saas.demo.annotation.DataSourceTypeAnno;
import cn.com.betasoft.saas.demo.datasource.DataSourceEnum;
import cn.com.betasoft.saas.demo.mapper.SysUserByMySqlMapper;
import cn.com.betasoft.saas.demo.model.SysUserModel;
import cn.com.betasoft.saas.demo.service.Test1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Test1ServiceImpl implements Test1Service {

    @Autowired
    private SysUserByMySqlMapper userInfoMapper;

    @DataSourceTypeAnno(DataSourceEnum.mysql)
    public SysUserModel selectUserInfo() {
        return userInfoMapper.findSysByUserName("admin");
    }
}