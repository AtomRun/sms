package com.leeup.sms.mapper;

import com.leeup.sms.bean.Student;

public interface StudentMapper {
    int deleteByPrimaryKey(String studentNo);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(String studentNo);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}