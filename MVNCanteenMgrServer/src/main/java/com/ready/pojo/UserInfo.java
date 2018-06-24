package com.ready.pojo;

public class UserInfo {
    private Integer userId;

    private String userAccount;

    private String userPassword;

    private Integer userAuz;

    public UserInfo(Integer userId, String userAccount, String userPassword, Integer userAuz) {
        this.userId = userId;
        this.userAccount = userAccount;
        this.userPassword = userPassword;
        this.userAuz = userAuz;
    }

    public UserInfo() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount == null ? null : userAccount.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public Integer getUserAuz() {
        return userAuz;
    }

    public void setUserAuz(Integer userAuz) {
        this.userAuz = userAuz;
    }
}