package cn.com.betasoft.saas.demo.dao.impl;

import cn.com.betasoft.saas.demo.dao.UserDao;
import cn.com.betasoft.saas.demo.model.UserModel;
import cn.com.betasoft.saas.demo.utils.MySqlSession;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UserDaoImpl  {
    public List<UserModel> getAllUserModels() {
        SqlSession session = MySqlSession.newSqlSession();
        try {
            List<UserModel> users = session.selectList("selectAllUser");
            return users;
        } finally {
            session.close();
        }
    }

    public UserModel getUserModelById(String id) {
        SqlSession session = MySqlSession.newSqlSession();
        try {
            UserModel user = session.selectOne("selectUserById", id);
            return user;
        } finally {
            session.close();
        }
    }
}
