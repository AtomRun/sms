package com.leeup.sms.bean;

import java.math.BigDecimal;

public class Course {
    private String courseNo;

    private String courseName;

    private BigDecimal creditHour;

    private Byte courseHour;

    private String priorCourse;

    public String getCourseNo() {
        return courseNo;
    }

    public void setCourseNo(String courseNo) {
        this.courseNo = courseNo == null ? null : courseNo.trim();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName == null ? null : courseName.trim();
    }

    public BigDecimal getCreditHour() {
        return creditHour;
    }

    public void setCreditHour(BigDecimal creditHour) {
        this.creditHour = creditHour;
    }

    public Byte getCourseHour() {
        return courseHour;
    }

    public void setCourseHour(Byte courseHour) {
        this.courseHour = courseHour;
    }

    public String getPriorCourse() {
        return priorCourse;
    }

    public void setPriorCourse(String priorCourse) {
        this.priorCourse = priorCourse == null ? null : priorCourse.trim();
    }
}