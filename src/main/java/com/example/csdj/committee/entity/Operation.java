package com.example.csdj.committee.entity;

import org.joda.time.DateTime;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;
@Component
public class Operation implements Serializable {
    private Integer logId;
    private String userName;
    private String operation;
    private Date time;

    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
