package com.wkang.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Orders)订单表
 *
 * @author wkang
 * @since 2020-02-28 12:43:17
 */
public class Orders implements Serializable {
    private static final long serialVersionUID = 956590452062470543L;
    
    private Integer orderid;//订单Id
    
    private String ordernum;//订单号
    
    private Integer userid;//用户Id
    
    private Date orderdate;//订单创建日期
    
    private String status;//订单状态


    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public String getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(String ordernum) {
        this.ordernum = ordernum;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}