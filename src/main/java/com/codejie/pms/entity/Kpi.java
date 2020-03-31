package com.codejie.pms.entity;

public class Kpi {
    private String kpiId;
    private String kpiName;
    private String kpiDescription;
    private String kpiGrading;
    private Double kpiWeight;

    public String getKpiId() {
        return kpiId;
    }

    public void setKpiId(String kpiId) {
        this.kpiId = kpiId;
    }

    public String getKpiName() {
        return kpiName;
    }

    public void setKpiName(String kpiName) {
        this.kpiName = kpiName;
    }

    public String getKpiDescription() {
        return kpiDescription;
    }

    public void setKpiDescription(String kpiDescription) {
        this.kpiDescription = kpiDescription;
    }

    public String getKpiGrading() {
        return kpiGrading;
    }

    public void setKpiGrading(String kpiGrading) {
        this.kpiGrading = kpiGrading;
    }

    public Double getKpiWeight() {
        return kpiWeight;
    }

    public void setKpiWeight(Double kpiWeight) {
        this.kpiWeight = kpiWeight;
    }
}
