package com.codejie.pms.entity;


public class WeakCheck {

  private long checkId;
  private String checkName;
  private String checkDesc;
  private long checkPoint;
  private int isNow;


  public long getCheckId() {
    return checkId;
  }

  public void setCheckId(long checkId) {
    this.checkId = checkId;
  }


  public String getCheckName() {
    return checkName;
  }

  public void setCheckName(String checkName) {
    this.checkName = checkName;
  }


  public String getCheckDesc() {
    return checkDesc;
  }

  public void setCheckDesc(String checkDesc) {
    this.checkDesc = checkDesc;
  }


  public long getCheckPoint() {
    return checkPoint;
  }

  public void setCheckPoint(long checkPoint) {
    this.checkPoint = checkPoint;
  }

  public int getIsNow() {
    return isNow;
  }

  public void setIsNow(int isNow) {
    this.isNow = isNow;
  }

}
