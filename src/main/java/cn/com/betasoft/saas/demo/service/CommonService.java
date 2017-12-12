package cn.com.betasoft.saas.demo.service;

import cn.com.betasoft.saas.demo.model.SysUserModel;

import java.util.List;

/**
 * @author <a href="mailto:huanhuan.zhan@ptthink.com">詹欢欢</a>
 * @since 2016/7/5 - 22:20
 */
public interface CommonService {
    SysUserModel selectUserInfo();

    List<Object> selectUserDetail();
}
