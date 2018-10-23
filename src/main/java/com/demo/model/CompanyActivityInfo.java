package com.demo.model;

import java.util.Date;

public class CompanyActivityInfo {
    private Long id;

    private Long companyId;

    private String activityType;

    private Date applyStartTime;

    private Date applyEndTime;

    private Date competitionStartTime;

    private Date competitionEndTime;

    private Byte status;

    private Long applicant;

    private Long participant;

    private Long virtual;

    private String activityLink;

    private String riskAndDisclaimer;

    private String createBy;

    private Date createTime;

    private String updateBy;

    private Date updateTime;

    private String competitionNotice;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType == null ? null : activityType.trim();
    }

    public Date getApplyStartTime() {
        return applyStartTime;
    }

    public void setApplyStartTime(Date applyStartTime) {
        this.applyStartTime = applyStartTime;
    }

    public Date getApplyEndTime() {
        return applyEndTime;
    }

    public void setApplyEndTime(Date applyEndTime) {
        this.applyEndTime = applyEndTime;
    }

    public Date getCompetitionStartTime() {
        return competitionStartTime;
    }

    public void setCompetitionStartTime(Date competitionStartTime) {
        this.competitionStartTime = competitionStartTime;
    }

    public Date getCompetitionEndTime() {
        return competitionEndTime;
    }

    public void setCompetitionEndTime(Date competitionEndTime) {
        this.competitionEndTime = competitionEndTime;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Long getApplicant() {
        return applicant;
    }

    public void setApplicant(Long applicant) {
        this.applicant = applicant;
    }

    public Long getParticipant() {
        return participant;
    }

    public void setParticipant(Long participant) {
        this.participant = participant;
    }

    public Long getVirtual() {
        return virtual;
    }

    public void setVirtual(Long virtual) {
        this.virtual = virtual;
    }

    public String getActivityLink() {
        return activityLink;
    }

    public void setActivityLink(String activityLink) {
        this.activityLink = activityLink == null ? null : activityLink.trim();
    }

    public String getRiskAndDisclaimer() {
        return riskAndDisclaimer;
    }

    public void setRiskAndDisclaimer(String riskAndDisclaimer) {
        this.riskAndDisclaimer = riskAndDisclaimer == null ? null : riskAndDisclaimer.trim();
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

    public String getCompetitionNotice() {
        return competitionNotice;
    }

    public void setCompetitionNotice(String competitionNotice) {
        this.competitionNotice = competitionNotice == null ? null : competitionNotice.trim();
    }
}