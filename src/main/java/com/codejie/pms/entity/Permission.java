package com.codejie.pms.entity;


public class Permission {

  private long permissionId;
  private String permissionName;
  private long permissionDegree;
  private String perUrl;


  public long getPermissionId() {
    return permissionId;
  }

  public void setPermissionId(long permissionId) {
    this.permissionId = permissionId;
  }


  public String getPermissionName() {
    return permissionName;
  }

  public void setPermissionName(String permissionName) {
    this.permissionName = permissionName;
  }


  public long getPermissionDegree() {
    return permissionDegree;
  }

  public void setPermissionDegree(long permissionDegree) {
    this.permissionDegree = permissionDegree;
  }


  public String getPerUrl() {
    return perUrl;
  }

  public void setPerUrl(String perUrl) {
    this.perUrl = perUrl;
  }

}
