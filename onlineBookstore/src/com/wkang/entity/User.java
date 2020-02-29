package com.wkang.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (User)用户表
 *
 * @author wkang
 * @since 2020-02-28 12:43:17
 */
public class User implements Serializable {
    private static final long serialVersionUID = -60307528932292896L;
    
    private Integer userid;//用户Id
    
    private String phone;//手机号
    
    private String email;//邮箱
    
    private String qq;//QQ
    
    private String address;//地址
    
    private String userrealname;//真实姓名
    
    private Date regdate;//注册时间
    
    private Date lastdate;//上次登录时间

    private Integer age;//年龄

    private String gender;//性别

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUserrealname() {
        return userrealname;
    }

    public void setUserrealname(String userrealname) {
        this.userrealname = userrealname;
    }

    public Date getRegdate() {
        return regdate;
    }

    public void setRegdate(Date regdate) {
        this.regdate = regdate;
    }

    public Date getLastdate() {
        return lastdate;
    }

    public void setLastdate(Date lastdate) {
        this.lastdate = lastdate;
    }

}