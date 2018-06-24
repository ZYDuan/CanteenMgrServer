package com.ready.pojo;

public class ClassInfo {
    private Integer classId;

    private Integer grade;

    private String className;

    public ClassInfo(Integer classId, Integer grade, String className) {
        this.classId = classId;
        this.grade = grade;
        this.className = className;
    }

    public ClassInfo() {
        super();
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }
}