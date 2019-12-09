package com.leeup.sms.bean;

import java.util.Date;

public class Student {
    private String studentNo;

    private String studentName;

    private String sex;

    private Date birthday;

    private String nations;

    private String classStudentNo;

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo == null ? null : studentNo.trim();
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getNations() {
        return nations;
    }

    public void setNations(String nations) {
        this.nations = nations == null ? null : nations.trim();
    }

    public String getClassStudentNo() {
        return classStudentNo;
    }

    public void setClassStudentNo(String classStudentNo) {
        this.classStudentNo = classStudentNo == null ? null : classStudentNo.trim();
    }
}