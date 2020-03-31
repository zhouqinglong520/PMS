package com.codejie.pms.entity;


public class User {

  private String userId;
  private String userName;
  private String pwd;
  private long permissionDegree;
  private String departmentId;
  private double kpiSum;
  private String phone;
  private String email;
  private String hometown;
  private String gender;


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public String getPwd() {
    return pwd;
  }

  public void setPwd(String pwd) {
    this.pwd = pwd;
  }


  public long getPermissionDegree() {
    return permissionDegree;
  }

  public void setPermissionDegree(long permissionDegree) {
    this.permissionDegree = permissionDegree;
  }


  public String getDepartmentId() {
    return departmentId;
  }

  public void setDepartmentId(String departmentId) {
    this.departmentId = departmentId;
  }


  public double getKpiSum() {
    return kpiSum;
  }

  public void setKpiSum(double kpiSum) {
    this.kpiSum = kpiSum;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public String getHometown() {
    return hometown;
  }

  public void setHometown(String hometown) {
    this.hometown = hometown;
  }


  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

}
