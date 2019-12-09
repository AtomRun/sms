package com.leeup.sms.bean;

public class Clazz {
    private String classStudentNo;

    private String classStudentName;

    private String institute;

    private Short grade;

    private Byte classnum;

    public String getClassStudentNo() {
        return classStudentNo;
    }

    public void setClassStudentNo(String classStudentNo) {
        this.classStudentNo = classStudentNo == null ? null : classStudentNo.trim();
    }

    public String getClassStudentName() {
        return classStudentName;
    }

    public void setClassStudentName(String classStudentName) {
        this.classStudentName = classStudentName == null ? null : classStudentName.trim();
    }

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute == null ? null : institute.trim();
    }

    public Short getGrade() {
        return grade;
    }

    public void setGrade(Short grade) {
        this.grade = grade;
    }

    public Byte getClassnum() {
        return classnum;
    }

    public void setClassnum(Byte classnum) {
        this.classnum = classnum;
    }
}