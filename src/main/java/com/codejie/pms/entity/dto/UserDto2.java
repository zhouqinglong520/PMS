package com.codejie.pms.entity.dto;

import com.codejie.pms.entity.User;
import java.sql.Date;

public class UserDto2 extends User {
    private String addDesc;
    private String addPoint;
    private Date addTime;

    public String getAddDesc() {
        return addDesc;
    }

    public void setAddDesc(String addDesc) {
        this.addDesc = addDesc;
    }

    public String getAddPoint() {
        return addPoint;
    }

    public void setAddPoint(String addPoint) {
        this.addPoint = addPoint;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}
