package cn.com.betasoft.saas.demo.mapper.mysql;

import cn.com.betasoft.saas.demo.model.SysUserModel;
import cn.com.betasoft.saas.demo.model.UserModel;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserByMySqlMapper {
    @Select("select * from users")
    public List<UserModel> selectAllUser();

    @Select("select * from users where id=#{id}")
    public UserModel selectUserById(String id);

    @Insert("insert into users(id,userName,userPassword,mobilephone) values(#{id},#{userName},#{userPassword},#{mobilephone})")
    public void insertUser(UserModel user);

    @Delete("delete from users where id=#{id}")
    public void deleteUserById(String id);

    @Update("update users set userName=#{userName} where id=#{id}")
    public void updateUser(UserModel user);

}
