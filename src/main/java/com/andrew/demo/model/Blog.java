package com.andrew.demo.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "blog")
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "title")
    private String title;
    private String content;
    @Column(name = "createtime")
    private Date createTime;
    @Column(name = "lastmodify")
    private Date lastModify;
    private String author;
    @Column(name = "viewcount")
    private int viewCount;

    public Blog() {
    }

    public Blog(String title, String content, Date createTime, Date lastModify, String author, int viewCount) {
        this.title = title;
        this.content = content;
        this.createTime = createTime;
        this.lastModify = lastModify;
        this.author = author;
        this.viewCount = viewCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastModify() {
        return lastModify;
    }

    public void setLastModify(Date lastModify) {
        this.lastModify = lastModify;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }
}
