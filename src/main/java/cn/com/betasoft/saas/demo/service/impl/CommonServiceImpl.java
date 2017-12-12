package cn.com.betasoft.saas.demo.service.impl;

import cn.com.betasoft.saas.demo.model.SysUserModel;
import cn.com.betasoft.saas.demo.service.CommonService;
import cn.com.betasoft.saas.demo.service.Test1Service;
import cn.com.betasoft.saas.demo.service.Test2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author <a href="mailto:huanhuan.zhan@ptthink.com">詹欢欢</a>
 * @since 2016/7/5 - 22:20
 */
@Service
public class CommonServiceImpl implements CommonService {

    @Autowired
    private Test1Service test1Service;
    @Autowired
    private Test2Service test2Service;

    public SysUserModel selectUserInfo() {
        return test1Service.selectUserInfo();
    }

    public List<Object> selectUserDetail() {
        return test2Service.selectUserDetail();
    }
}
