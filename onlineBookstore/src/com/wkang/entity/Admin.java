package com.wkang.entity;

import java.io.Serializable;

/**
 * (Admin)管理员
 *
 * @author wkang
 * @since 2020-02-28 12:43:16
 */
public class Admin implements Serializable {
    private static final long serialVersionUID = 136000647689251393L;
    
    private Integer adminid;//管理员Id
    
    private String adminname;//管理员姓名
    
    private String loginname;//登录名
    
    private String loginpwd;//登录密码


    public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getLoginpwd() {
        return loginpwd;
    }

    public void setLoginpwd(String loginpwd) {
        this.loginpwd = loginpwd;
    }

}