package com.ready.pojo;

public class StudentData {
    private Integer sdId;

    private String stuUqId;

    private Integer stuInfo;

    private String stuFinger;

    public StudentData(Integer sdId, String stuUqId, Integer stuInfo, String stuFinger) {
        this.sdId = sdId;
        this.stuUqId = stuUqId;
        this.stuInfo = stuInfo;
        this.stuFinger = stuFinger;
    }

    public StudentData() {
        super();
    }

    public Integer getSdId() {
        return sdId;
    }

    public void setSdId(Integer sdId) {
        this.sdId = sdId;
    }

    public String getStuUqId() {
        return stuUqId;
    }

    public void setStuUqId(String stuUqId) {
        this.stuUqId = stuUqId == null ? null : stuUqId.trim();
    }

    public Integer getStuInfo() {
        return stuInfo;
    }

    public void setStuInfo(Integer stuInfo) {
        this.stuInfo = stuInfo;
    }

    public String getStuFinger() {
        return stuFinger;
    }

    public void setStuFinger(String stuFinger) {
        this.stuFinger = stuFinger == null ? null : stuFinger.trim();
    }
}