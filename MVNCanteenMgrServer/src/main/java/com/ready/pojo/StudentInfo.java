package com.ready.pojo;

public class StudentInfo {
    private Integer sId;

    private String stuId;

    private String stuName;

    private Float stuMoney;

    private String stuPwd;

    private Integer stuClass;

    public StudentInfo(Integer sId, String stuId, String stuName, Float stuMoney, String stuPwd, Integer stuClass) {
        this.sId = sId;
        this.stuId = stuId;
        this.stuName = stuName;
        this.stuMoney = stuMoney;
        this.stuPwd = stuPwd;
        this.stuClass = stuClass;
    }

    public StudentInfo() {
        super();
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId == null ? null : stuId.trim();
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName == null ? null : stuName.trim();
    }

    public Float getStuMoney() {
        return stuMoney;
    }

    public void setStuMoney(Float stuMoney) {
        this.stuMoney = stuMoney;
    }

    public String getStuPwd() {
        return stuPwd;
    }

    public void setStuPwd(String stuPwd) {
        this.stuPwd = stuPwd == null ? null : stuPwd.trim();
    }

    public Integer getStuClass() {
        return stuClass;
    }

    public void setStuClass(Integer stuClass) {
        this.stuClass = stuClass;
    }
}