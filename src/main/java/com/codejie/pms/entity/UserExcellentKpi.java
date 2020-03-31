package com.codejie.pms.entity;


import java.sql.Date;

public class UserExcellentKpi {

  private long kpiId;
  private String kpiMs;
  private String userName;
  private String userId;
  private long kpiPoint;
  private Date kpiTime;
  private String kpiResult;
  private int kpiDegree;
  private String kpiDegreeMs;


  public long getKpiId() {
    return kpiId;
  }

  public void setKpiId(long kpiId) {
    this.kpiId = kpiId;
  }


  public String getKpiMs() {
    return kpiMs;
  }

  public void setKpiMs(String kpiMs) {
    this.kpiMs = kpiMs;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  public long getKpiPoint() {
    return kpiPoint;
  }

  public void setKpiPoint(long kpiPoint) {
    this.kpiPoint = kpiPoint;
  }


  public Date getKpiTime() {
    return kpiTime;
  }

  public void setKpiTime(Date kpiTime) {
    this.kpiTime = kpiTime;
  }


  public String getKpiResult() {
    return kpiResult;
  }

  public void setKpiResult(String kpiResult) {
    this.kpiResult = kpiResult;
  }

  public int getKpiDegree() {
    return kpiDegree;
  }

  public void setKpiDegree(int kpiDegree) {
    this.kpiDegree = kpiDegree;
  }

  public String getKpiDegreeMs() {
    return kpiDegreeMs;
  }

  public void setKpiDegreeMs(String kpiDegreeMs) {
    this.kpiDegreeMs = kpiDegreeMs;
  }
}
