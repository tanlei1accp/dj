package com.example.csdj.branch.entity;

public class Activity {
    private int activityId;
    private String activityHoldingTime;
    private String activityPlace;
    private String activityPeople;
    private String activityRecord;
    private int activityFlag;
    private Department departmentId;

    public int getActivityId() {
        return activityId;
    }

    public void setActivityId(int activityId) {
        this.activityId = activityId;
    }

    public String getActivityHoldingTime() {
        return activityHoldingTime;
    }

    public void setActivityHoldingTime(String activityHoldingTime) {
        this.activityHoldingTime = activityHoldingTime;
    }

    public String getActivityPlace() {
        return activityPlace;
    }

    public void setActivityPlace(String activityPlace) {
        this.activityPlace = activityPlace;
    }

    public String getActivityPeople() {
        return activityPeople;
    }

    public void setActivityPeople(String activityPeople) {
        this.activityPeople = activityPeople;
    }

    public String getActivityRecord() {
        return activityRecord;
    }

    public void setActivityRecord(String activityRecord) {
        this.activityRecord = activityRecord;
    }

    public int getActivityFlag() {
        return activityFlag;
    }

    public void setActivityFlag(int activityFlag) {
        this.activityFlag = activityFlag;
    }

    public Department getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Department departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "activityId=" + activityId +
                ", activityHoldingTime='" + activityHoldingTime + '\'' +
                ", activityPlace='" + activityPlace + '\'' +
                ", activityPeople='" + activityPeople + '\'' +
                ", activityRecord='" + activityRecord + '\'' +
                ", activityFlag=" + activityFlag +
                ", departmentId=" + departmentId +
                '}';
    }

    public Activity(int activityId, String activityHoldingTime, String activityPlace, String activityPeople, String activityRecord, int activityFlag, Department departmentId) {
        this.activityId = activityId;
        this.activityHoldingTime = activityHoldingTime;
        this.activityPlace = activityPlace;
        this.activityPeople = activityPeople;
        this.activityRecord = activityRecord;
        this.activityFlag = activityFlag;
        this.departmentId = departmentId;
    }

    public Activity() {
        super();
    }
}
