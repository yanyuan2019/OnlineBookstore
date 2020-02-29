package com.wkang.entity;

import java.io.Serializable;

/**
 * (Login)用户登录表
 *
 * @author wkang
 * @since 2020-02-28 12:43:17
 */
public class Login implements Serializable {
    private static final long serialVersionUID = 471209842811183506L;
    
    private Integer userid;//用户Id
    
    private String username;//用户名
    
    private String password;//密码


    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}