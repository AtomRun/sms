package com.leeup.sms.mapper;

import com.leeup.sms.bean.Course;

public interface CourseMapper {
    int deleteByPrimaryKey(String courseNo);

    int insert(Course record);

    int insertSelective(Course record);

    Course selectByPrimaryKey(String courseNo);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);
}