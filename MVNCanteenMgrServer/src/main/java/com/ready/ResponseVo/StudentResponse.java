package com.ready.ResponseVo;

/**
 * @program: MVNCanteenMgr
 * @author: zyd
 * @description: 响应请求返回的student信息类
 * @create: 2018-06-18 21:53
 */
public class StudentResponse {

    //数据库student的id
    private Integer sId;
    //班级里面学生id
    private Integer stuId;
    //学生名字
    private String stuName;
    //    班级
    private String className;
    //    年级
    private String grade;

    private Float stuMoney;

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Float getStuMoney() {
        return stuMoney;
    }

    public void setStuMoeny(Float stuMoney) {
        this.stuMoney = stuMoney;
    }
}
