package com.wkang.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Cart)购物车
 *
 * @author wkang
 * @since 2020-02-28 12:43:17
 */
public class Cart implements Serializable {
    private static final long serialVersionUID = 958553749892709411L;
    
    private Integer id;//序号
    
    private String cartid;//购物车Id
    
    private Integer bookid;//图书Id
    
    private Integer userid;//用户Id
    
    private Integer quantity;//数量
    
    private Date createddate;//创建时间


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCartid() {
        return cartid;
    }

    public void setCartid(String cartid) {
        this.cartid = cartid;
    }

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Date getCreateddate() {
        return createddate;
    }

    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }

}