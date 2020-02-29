package com.wkang.entity;

import java.io.Serializable;

/**
 * (Bookcategory)图书类别
 *
 * @author wkang
 * @since 2020-02-28 12:43:17
 */
public class Bookcategory implements Serializable {
    private static final long serialVersionUID = 745034722167021316L;
    
    private Integer categoryid; //图书类别号码
    
    private String categoryname;//图书类别


    public Integer getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }

}