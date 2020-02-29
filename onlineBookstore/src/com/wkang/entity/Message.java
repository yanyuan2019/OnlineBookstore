package com.wkang.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Message)留言表
 *
 * @author wkang
 * @since 2020-02-28 12:43:17
 */
public class Message implements Serializable {
    private static final long serialVersionUID = 760288406550798259L;
    
    private Integer id;//序号
    
    private String title;// 标题
    
    private String content;//内容
    
    private String commenter;//留言人
    
    private Date messagedate;//留言时间


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCommenter() {
        return commenter;
    }

    public void setCommenter(String commenter) {
        this.commenter = commenter;
    }

    public Date getMessagedate() {
        return messagedate;
    }

    public void setMessagedate(Date messagedate) {
        this.messagedate = messagedate;
    }

}