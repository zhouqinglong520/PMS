package com.codejie.pms.entity;


import java.sql.Date;

public class AddPoint extends User{

  private long addId;
  private String userId;
  private String userName;
  private long addPoint;
  private String addDesc;
  private Date addTime;


  public long getAddId() {
    return addId;
  }

  public void setAddId(long addId) {
    this.addId = addId;
  }

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
}
