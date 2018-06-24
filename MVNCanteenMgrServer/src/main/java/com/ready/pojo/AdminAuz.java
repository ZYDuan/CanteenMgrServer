package com.ready.pojo;

public class AdminAuz {
    private Integer auzId;

    private Integer auzLevel;

    public AdminAuz(Integer auzId, Integer auzLevel) {
        this.auzId = auzId;
        this.auzLevel = auzLevel;
    }

    public AdminAuz() {
        super();
    }

    public Integer getAuzId() {
        return auzId;
    }

    public void setAuzId(Integer auzId) {
        this.auzId = auzId;
    }

    public Integer getAuzLevel() {
        return auzLevel;
    }

    public void setAuzLevel(Integer auzLevel) {
        this.auzLevel = auzLevel;
    }
}