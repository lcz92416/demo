package cn.com.betasoft.saas.demo.mapper.mysql;

import cn.com.betasoft.saas.demo.model.SysUserModel;
import cn.com.betasoft.saas.demo.utils.SysUserByMySqlProvider;
import org.apache.ibatis.annotations.*;

public interface SysUserByMySqlMapper {
    @SelectProvider(type= SysUserByMySqlProvider.class,method = "findSysByUserName")
    public SysUserModel findSysByUserName(String username);
}
