package com.leeup.sms.controller;

import com.leeup.sms.bean.User;
import com.leeup.sms.common.Const;
import com.leeup.sms.common.ServerResponse;
import com.leeup.sms.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author cLee
 * @Date{2019/12/5}
 * @Version 1.0
 **/
@Controller
@RequestMapping("/manage/user")
public class UserManageController {

    @Autowired
    private IUserService iUserService;

    //登录功能
    @RequestMapping(value = "login.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<User> login(String useraccount, String password, HttpSession session){
        ServerResponse<User> response = iUserService.login(useraccount,password);
        if (response.isSuccess()){
            User user = response.getData();
            //判断用户类型
            if (user.getUserType() == Const.Role.ROLE_ADMIN || user.getUserType() == Const.Role.ROLE_CUSTOMER){
                session.setAttribute(Const.CURRENT_USER,user);
                return response;
            }else {
                return ServerResponse.createByErrorMessage("您不是管理员或老师，无法登录");
            }
        }
        //如果response.isSuccess未执行，也就是说不是成功的，直接返回response
        return response;
    }
}
