package com.codejie.pms.entity;


public class Department {

  private long qdId;
  private String departmentId;
  private String departmentName;
  private String qdms;
  private String qdkh;
  private long departmentKpi;
  private long departmentNum;


  public long getQdId() {
    return qdId;
  }

  public void setQdId(long qdId) {
    this.qdId = qdId;
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


  public String getQdms() {
    return qdms;
  }

  public void setQdms(String qdms) {
    this.qdms = qdms;
  }


  public String getQdkh() {
    return qdkh;
  }

  public void setQdkh(String qdkh) {
    this.qdkh = qdkh;
  }


  public long getDepartmentKpi() {
    return departmentKpi;
  }

  public void setDepartmentKpi(long departmentKpi) {
    this.departmentKpi = departmentKpi;
  }

  public long getDepartmentNum() {
    return departmentNum;
  }

  public void setDepartmentNum(long departmentNum) {
    this.departmentNum = departmentNum;
  }

}
