package com.example.csdj.member.entity;

import java.util.Date;

//通知公告表
public class Notice {
    private int id;  //通知公告编号
    private String name;//标题
    private String content;//内容
    private Date time;//发布时间
    private int flag;//是否发布，0未发布，1已发布
    private String publisher;//发布者 机关党委管理员
    private Date date;//修改日期
    private String people;//修改人
    private int state;//删除标记  0：未删除 1：已删除

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Notice{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", time=" + time +
                ", flag=" + flag +
                ", publisher='" + publisher + '\'' +
                ", date=" + date +
                ", people='" + people + '\'' +
                ", state=" + state +
                '}';
    }
}
