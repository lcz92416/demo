package cn.com.betasoft.saas.demo.web.controller;

import cn.com.betasoft.saas.demo.dao.UserDao;
import cn.com.betasoft.saas.demo.model.UserModel;
import cn.com.betasoft.saas.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getAllUser")
    public String getAllUser(Model model){
        List<UserModel> userModels=userService.selectAllUser();
        model.addAttribute("userModels",userModels);
        return "userInfo";
    }

    @RequestMapping("/update")
    @ResponseBody
    public String updateUser(@RequestParam(value="userId") String userId){
        UserModel user=userService.selectUserById(userId);
        user.setUserName("updateSuccess");
        userService.updateUser(user);
        return "success";
    }

}
