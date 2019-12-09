package com.leeup.sms.service;

import com.leeup.sms.bean.User;
import com.leeup.sms.common.ServerResponse;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserService
 * @Description TODO
 * @Author cLee
 * @Date{2019/12/5}
 * @Version 1.0
 **/
public interface IUserService {

    //登录
    ServerResponse<User> login(String useraccount, String password);
}
