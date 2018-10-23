package com.demo.model;

import java.util.Date;

public class ListWeight {
    private Long id;

    private Long activityId;

    private Float yieldRate;

    private Float yieldMoney;

    private Float transactionNumber;

    private Float netWorth;

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

    public Float getYieldRate() {
        return yieldRate;
    }

    public void setYieldRate(Float yieldRate) {
        this.yieldRate = yieldRate;
    }

    public Float getYieldMoney() {
        return yieldMoney;
    }

    public void setYieldMoney(Float yieldMoney) {
        this.yieldMoney = yieldMoney;
    }

    public Float getTransactionNumber() {
        return transactionNumber;
    }

    public void setTransactionNumber(Float transactionNumber) {
        this.transactionNumber = transactionNumber;
    }

    public Float getNetWorth() {
        return netWorth;
    }

    public void setNetWorth(Float netWorth) {
        this.netWorth = netWorth;
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