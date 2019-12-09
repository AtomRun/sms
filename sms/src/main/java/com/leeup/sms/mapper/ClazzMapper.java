package com.leeup.sms.mapper;

import com.leeup.sms.bean.Clazz;

public interface ClazzMapper {
    int deleteByPrimaryKey(String classStudentNo);

    int insert(Clazz record);

    int insertSelective(Clazz record);

    Clazz selectByPrimaryKey(String classStudentNo);

    int updateByPrimaryKeySelective(Clazz record);

    int updateByPrimaryKey(Clazz record);
}