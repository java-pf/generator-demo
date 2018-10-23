package com.demo.model;

import java.util.Date;

public class ActivityAwards {
    private Long id;

    private Long activityId;

    private Byte awardsType;

    private String awardsSetting;

    private String prizeName;

    private Integer prizeNumber;

    private String specialVersion;

    private Integer theWinningNumber;

    private String createBy;

    private Date createTime;

    private String updateBy;

    private Date updateTime;

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

    public Byte getAwardsType() {
        return awardsType;
    }

    public void setAwardsType(Byte awardsType) {
        this.awardsType = awardsType;
    }

    public String getAwardsSetting() {
        return awardsSetting;
    }

    public void setAwardsSetting(String awardsSetting) {
        this.awardsSetting = awardsSetting == null ? null : awardsSetting.trim();
    }

    public String getPrizeName() {
        return prizeName;
    }

    public void setPrizeName(String prizeName) {
        this.prizeName = prizeName == null ? null : prizeName.trim();
    }

    public Integer getPrizeNumber() {
        return prizeNumber;
    }

    public void setPrizeNumber(Integer prizeNumber) {
        this.prizeNumber = prizeNumber;
    }

    public String getSpecialVersion() {
        return specialVersion;
    }

    public void setSpecialVersion(String specialVersion) {
        this.specialVersion = specialVersion == null ? null : specialVersion.trim();
    }

    public Integer getTheWinningNumber() {
        return theWinningNumber;
    }

    public void setTheWinningNumber(Integer theWinningNumber) {
        this.theWinningNumber = theWinningNumber;
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

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}