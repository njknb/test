package com.hy.demo.common;

/**
 * @author: 何志权27629
 * @description:
 * @date: 2020-12-25 10:30
 */
public class PersonnelInfo {

    /** 创建人工号 */
    private String createBy;

    /** 创建人名称 */
    private String createByName;

    /** 创建时间 */
    private String createTime;

    /** 最后更新人工号 */
    private String lastUpdatedBy;

    /** 最后更新人名称 */
    private String lastUpdatedByName;

    /** 最后更新时间 */
    private String lastUpdatedTime;

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getCreateByName() {
        return createByName;
    }

    public void setCreateByName(String createByName) {
        this.createByName = createByName;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public String getLastUpdatedByName() {
        return lastUpdatedByName;
    }

    public void setLastUpdatedByName(String lastUpdatedByName) {
        this.lastUpdatedByName = lastUpdatedByName;
    }

    public String getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    public void setLastUpdatedTime(String lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    @Override
    public String toString() {
        return "PersonnelInfo{" +
                "createBy='" + createBy + '\'' +
                ", createByName='" + createByName + '\'' +
                ", createTime='" + createTime + '\'' +
                ", lastUpdatedBy='" + lastUpdatedBy + '\'' +
                ", lastUpdatedByName='" + lastUpdatedByName + '\'' +
                ", lastUpdatedTime='" + lastUpdatedTime + '\'' +
                '}';
    }
}
