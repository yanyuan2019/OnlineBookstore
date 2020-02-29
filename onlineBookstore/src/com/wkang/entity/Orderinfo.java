package com.wkang.entity;

import java.io.Serializable;

/**
 * (Orderinfo)订单详情表
 *
 * @author wkang
 * @since 2020-02-28 12:43:17
 */
public class Orderinfo implements Serializable {
    private static final long serialVersionUID = -15018093140981582L;
    
    private Integer itemid;//序号
    
    private Integer orderid;//订单号
    
    private Integer bookid;//用户Id
    
    private Integer quantity;//数量
    
    private Double unitcost;//单价


    public Integer getItemid() {
        return itemid;
    }

    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getUnitcost() {
        return unitcost;
    }

    public void setUnitcost(Double unitcost) {
        this.unitcost = unitcost;
    }

}