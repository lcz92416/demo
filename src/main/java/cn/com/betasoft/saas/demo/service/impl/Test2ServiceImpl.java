package cn.com.betasoft.saas.demo.service.impl;

import cn.com.betasoft.saas.demo.annotation.DataSourceTypeAnno;
import cn.com.betasoft.saas.demo.datasource.DataSourceEnum;
import cn.com.betasoft.saas.demo.mapper.SysUserByPgsqlMapper;
import cn.com.betasoft.saas.demo.service.Test2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Test2ServiceImpl implements Test2Service {

    @Autowired
    private SysUserByPgsqlMapper userDetailMapper;

    @DataSourceTypeAnno(DataSourceEnum.pgsql)
    public List<Object> selectUserDetail() {
        return userDetailMapper.findSysByUserName();
    }
}
