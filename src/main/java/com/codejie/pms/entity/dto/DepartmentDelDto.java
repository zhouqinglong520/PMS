package com.codejie.pms.entity.dto;

import java.util.Date;

public class DepartmentDelDto {

    private long checkId;

    private String departmentId;

    private String departmentName;

    private String checkName;

    private Integer countDepartment;

    private Date departmentAddPointTime;

    public long getCheckId() {
        return checkId;
    }

    public void setCheckId(long checkId) {
        this.checkId = checkId;
    }

    public Integer getCountDepartment() {
        return countDepartment;
    }

    public void setCountDepartment(Integer countDepartment) {
        this.countDepartment = countDepartment;
    }

    public Date getDepartmentAddPointTime() {
        return departmentAddPointTime;
    }

    public void setDepartmentAddPointTime(Date departmentAddPointTime) {
        this.departmentAddPointTime = departmentAddPointTime;
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

    public String getCheckName() {
        return checkName;
    }

    public void setCheckName(String checkName) {
        this.checkName = checkName;
    }
}
