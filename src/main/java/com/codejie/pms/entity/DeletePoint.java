package com.codejie.pms.entity;


import java.sql.Date;

public class DeletePoint extends User {

  private long deleteId;
  private String userId;
  private String userName;
  private long deletePoint;
  private String deleteDesc;
  private Date deleteTime;
  private long checkId;


  public long getDeleteId() {
    return deleteId;
  }

  public void setDeleteId(long deleteId) {
    this.deleteId = deleteId;
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


  public long getDeletePoint() {
    return deletePoint;
  }

  public void setDeletePoint(long deletePoint) {
    this.deletePoint = deletePoint;
  }


  public String getDeleteDesc() {
    return deleteDesc;
  }

  public void setDeleteDesc(String deleteDesc) {
    this.deleteDesc = deleteDesc;
  }


  public Date getDeleteTime() {
    return deleteTime;
  }

  public void setDeleteTime(Date deleteTime) {
    this.deleteTime = deleteTime;
  }

  public long getCheckId() {
    return checkId;
  }

  public void setCheckId(long checkId) {
    this.checkId = checkId;
  }
}
