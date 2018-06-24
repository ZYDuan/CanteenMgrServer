package com.ready.pojo;

public class MenuDict {
    private Integer mDictId;

    private String kindName;

    public MenuDict(Integer mDictId, String kindName) {
        this.mDictId = mDictId;
        this.kindName = kindName;
    }

    public MenuDict() {
        super();
    }

    public Integer getmDictId() {
        return mDictId;
    }

    public void setmDictId(Integer mDictId) {
        this.mDictId = mDictId;
    }

    public String getKindName() {
        return kindName;
    }

    public void setKindName(String kindName) {
        this.kindName = kindName == null ? null : kindName.trim();
    }
}