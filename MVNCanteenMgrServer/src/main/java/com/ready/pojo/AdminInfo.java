package com.ready.pojo;

public class AdminInfo {
    private Integer adminId;

    private String adminAccount;

    private String adminPassword;

    private Integer userAuz;

    public AdminInfo(Integer adminId, String adminAccount, String adminPassword, Integer userAuz) {
        this.adminId = adminId;
        this.adminAccount = adminAccount;
        this.adminPassword = adminPassword;
        this.userAuz = userAuz;
    }

    public AdminInfo() {
        super();
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminAccount() {
        return adminAccount;
    }

    public void setAdminAccount(String adminAccount) {
        this.adminAccount = adminAccount == null ? null : adminAccount.trim();
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword == null ? null : adminPassword.trim();
    }

    public Integer getUserAuz() {
        return userAuz;
    }

    public void setUserAuz(Integer userAuz) {
        this.userAuz = userAuz;
    }
}