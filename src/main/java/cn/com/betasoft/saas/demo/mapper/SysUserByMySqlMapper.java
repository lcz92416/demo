package cn.com.betasoft.saas.demo.mapper;

import cn.com.betasoft.saas.demo.model.SysRoleModel;
import cn.com.betasoft.saas.demo.model.SysUserModel;
import cn.com.betasoft.saas.demo.utils.SysUserByMySqlProvider;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

public interface SysUserByMySqlMapper {
//    @SelectProvider(type= SysUserByMySqlProvider.class,method = "findSysByUserName")
//    @Select("select * from Sys_User where username =#{username}")
//    @Results({
//            @Result(id = true,property = "id" ,column = "id"),
//            @Result(property ="password",column = "password"),
//            @Result(property ="username",column = "username"),
//            @Result(property ="roles",column="username",javaType=List.class
//                    ,many =@Many(select ="cn.com.betasoft.saas.demo.mapper.mysql.findRolesByUserName",fetchType= FetchType.EAGER))}
//    )
    public SysUserModel findSysByUserName(String userName);

//    @Select("        SELECT\n" +
//            "          sysrole.id,\n" +
//            "          sysrole.roleName\n" +
//            "        FROM\n" +
//            "          sys_role_user roles\n" +
//            "          INNER JOIN sys_role sysrole\n" +
//            "            ON roles.Sys_Role_id = sysrole.id\n" +
//            "          INNER JOIN sys_user sysuser\n" +
//            "            ON sysuser.id = roles.sys_user_id\n" +
//            "        WHERE sysuser.username = #{username}")
    public List<SysRoleModel> findRolesByUserName(String userName);
}
