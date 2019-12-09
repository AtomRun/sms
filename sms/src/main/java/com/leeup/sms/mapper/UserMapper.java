package com.leeup.sms.mapper;

import com.leeup.sms.bean.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    //检查用户名的方法
    int checkUsername(String useraccount);

    //检查用户名和密码是否匹配
    User selectLogin(@Param("useraccount") String useraccount, @Param("password") String password);
}