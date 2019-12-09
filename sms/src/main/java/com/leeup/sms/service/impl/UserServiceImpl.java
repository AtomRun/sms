package com.leeup.sms.service.impl;

import com.leeup.sms.bean.User;
import com.leeup.sms.common.ServerResponse;
import com.leeup.sms.mapper.UserMapper;
import com.leeup.sms.service.IUserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author cLee
 * @Date{2019/12/5}
 * @Version 1.0
 **/
@Service("iUserService")
public class UserServiceImpl implements IUserService {


    @Autowired
    private UserMapper userMapper;

    @Override
    public ServerResponse<User> login(String useraccount, String password) {
        int resultCount = userMapper.checkUsername(useraccount);
        if (resultCount == 0){
            return ServerResponse.createByErrorMessage("用户不存在");
        }

        User user = userMapper.selectLogin(useraccount,password);
        if (user==null){
            //如果用户名不存在的话上面就返回了，到了这里用户名是肯定存在的，只有密码错误
            return ServerResponse.createByErrorMessage("密码错误！");
        }
        //就是不让前台能够获取这个密码，尽管是加密的也不想让前端能够获取的到，其实就是为了客户的安全性着想的。
        user.setUserPassword(StringUtils.EMPTY);
        return ServerResponse.createBySuccess("登录成功",user);
    }
}
