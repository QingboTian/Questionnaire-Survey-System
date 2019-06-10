package com.tqb.pojo;

public class Admin {
    private Integer adminId;

    private String adminUname;

    private String adminPwd;

    private Integer adminPower;

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminUname() {
        return adminUname;
    }

    public void setAdminUname(String adminUname) {
        this.adminUname = adminUname == null ? null : adminUname.trim();
    }

    public String getAdminPwd() {
        return adminPwd;
    }

    public void setAdminPwd(String adminPwd) {
        this.adminPwd = adminPwd == null ? null : adminPwd.trim();
    }

    public Integer getAdminPower() {
        return adminPower;
    }

    public void setAdminPower(Integer adminPower) {
        this.adminPower = adminPower;
    }
}