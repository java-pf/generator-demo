package com.yingda.xsignal.model;

import java.util.Date;

public class ListWeight {
    private Long id;

    private Long activityId;

    private Float profitFactor;

    private Float transactionNumber;

    private String weightExplain;

    private String createBy;

    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    public Float getProfitFactor() {
        return profitFactor;
    }

    public void setProfitFactor(Float profitFactor) {
        this.profitFactor = profitFactor;
    }

    public Float getTransactionNumber() {
        return transactionNumber;
    }

    public void setTransactionNumber(Float transactionNumber) {
        this.transactionNumber = transactionNumber;
    }

    public String getWeightExplain() {
        return weightExplain;
    }

    public void setWeightExplain(String weightExplain) {
        this.weightExplain = weightExplain == null ? null : weightExplain.trim();
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}