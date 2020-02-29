package com.wkang.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Bookinfo)图书信息
 *
 * @author wkang
 * @since 2020-02-28 12:43:17
 */
public class Bookinfo implements Serializable {
    private static final long serialVersionUID = -79919756174501346L;
    
    private Integer bookid; //图书序号
    
    private String bookname;//图书名
    
    private Integer categoryid;//图书类标号
    
    private String author;//作者
    
    private String translator;//译者
    
    private String press;//出版社
    
    private Double price;//价格
    
    private String intorduction;//信息
    
    private String bookno;//书号
    
    private String imgpath;//封面地址
    
    private Date regtime;//入库时间
    
    private Integer amount;//总数量
    
    private Integer storenumber;//库存量


    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public Integer getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTranslator() {
        return translator;
    }

    public void setTranslator(String translator) {
        this.translator = translator;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getIntorduction() {
        return intorduction;
    }

    public void setIntorduction(String intorduction) {
        this.intorduction = intorduction;
    }

    public String getBookno() {
        return bookno;
    }

    public void setBookno(String bookno) {
        this.bookno = bookno;
    }

    public String getImgpath() {
        return imgpath;
    }

    public void setImgpath(String imgpath) {
        this.imgpath = imgpath;
    }

    public Date getRegtime() {
        return regtime;
    }

    public void setRegtime(Date regtime) {
        this.regtime = regtime;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getStorenumber() {
        return storenumber;
    }

    public void setStorenumber(Integer storenumber) {
        this.storenumber = storenumber;
    }

}