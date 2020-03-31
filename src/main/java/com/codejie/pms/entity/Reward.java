package com.codejie.pms.entity;


import java.sql.Date;

public class Reward {

  private long rewardId;
  private String userId;
  private String userName;
  private String rewardReason;
  private String rewardDesc;
  private Date rewardTime;


  public long getRewardId() {
    return rewardId;
  }

  public void setRewardId(long rewardId) {
    this.rewardId = rewardId;
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


  public String getRewardReason() {
    return rewardReason;
  }

  public void setRewardReason(String rewardReason) {
    this.rewardReason = rewardReason;
  }


  public String getRewardDesc() {
    return rewardDesc;
  }

  public void setRewardDesc(String rewardDesc) {
    this.rewardDesc = rewardDesc;
  }


  public Date getRewardTime() {
    return rewardTime;
  }

  public void setRewardTime(Date rewardTime) {
    this.rewardTime = rewardTime;
  }

}
