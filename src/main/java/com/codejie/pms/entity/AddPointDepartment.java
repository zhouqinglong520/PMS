package com.codejie.pms.entity;

import java.sql.Date;

public class AddPointDepartment {
    private long addId;
    private String departmentId;
    private String departmentName;
    private long addPoint;
    private String addDesc;
    private Date addTime;
    private String quarter;
    private String checkId;

    public long getAddId() {
        return addId;
    }

    public void setAddId(long addId) {
        this.addId = addId;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public long getAddPoint() {
        return addPoint;
    }

    public void setAddPoint(long addPoint) {
        this.addPoint = addPoint;
    }

    public String getAddDesc() {
        return addDesc;
    }

    public void setAddDesc(String addDesc) {
        this.addDesc = addDesc;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public String getQuarter() {
        return quarter;
    }

    public void setQuarter(String quarter) {
        this.quarter = quarter;
    }

    public String getCheckId() {
        return checkId;
    }

    public void setCheckId(String checkId) {
        this.checkId = checkId;
    }
}
