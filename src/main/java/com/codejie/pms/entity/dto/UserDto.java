package com.codejie.pms.entity.dto;

import com.codejie.pms.entity.User;

import java.sql.Date;

public class UserDto extends User {
    private String deleteDesc;
    private String deletePoint;
    private Date deleteTime;

    public String getDeleteDesc() {
        return deleteDesc;
    }

    public void setDeleteDesc(String deleteDesc) {
        this.deleteDesc = deleteDesc;
    }

    public String getDeletePoint() {
        return deletePoint;
    }

    public void setDeletePoint(String deletePoint) {
        this.deletePoint = deletePoint;
    }

    public Date getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }
}
