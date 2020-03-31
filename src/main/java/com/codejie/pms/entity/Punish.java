package com.codejie.pms.entity;


import java.sql.Date;

public class Punish {

  private long punishId;
  private String userId;
  private String userName;
  private String punishReason;
  private long punishComplete;
  private String punishDesc;
  private Date punishTime;


  public long getPunishId() {
    return punishId;
  }

  public void setPunishId(long punishId) {
    this.punishId = punishId;
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


  public String getPunishReason() {
    return punishReason;
  }

  public void setPunishReason(String punishReason) {
    this.punishReason = punishReason;
  }


  public long getPunishComplete() {
    return punishComplete;
  }

  public void setPunishComplete(long punishComplete) {
    this.punishComplete = punishComplete;
  }


  public String getPunishDesc() {
    return punishDesc;
  }

  public void setPunishDesc(String punishDesc) {
    this.punishDesc = punishDesc;
  }


  public Date getPunishTime() {
    return punishTime;
  }

  public void setPunishTime(Date punishTime) {
    this.punishTime = punishTime;
  }

}
