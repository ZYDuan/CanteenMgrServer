package com.ready.pojo;

public class DishDict {
    private Integer kindId;

    private String kindName;

    public DishDict(Integer kindId, String kindName) {
        this.kindId = kindId;
        this.kindName = kindName;
    }

    public DishDict() {
        super();
    }

    public Integer getKindId() {
        return kindId;
    }

    public void setKindId(Integer kindId) {
        this.kindId = kindId;
    }

    public String getKindName() {
        return kindName;
    }

    public void setKindName(String kindName) {
        this.kindName = kindName == null ? null : kindName.trim();
    }
}