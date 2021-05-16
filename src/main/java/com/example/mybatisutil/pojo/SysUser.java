package com.example.mybatisutil.pojo;

import lombok.Data;

import java.util.Date;

/**
 * 人员用户表
 *
 * create by qsm
 * sys_user
 */
@Data
public class SysUser {
    /**
     * 主键
     */
    private String id;

    /**
     * 用户编码
     */
    private String userNum;

    /**
     * 哦那个胡机构
     */
    private String orgCode;

    /**
     * 0 1 状态码 1 可用 0 注销 2未生效
     */
    private String status;

    /**
     * 最后一次登录时间
     */
    private Date lastLogingTime;

    /**
     * 删除标志
     */
    private String deleteFlag;

    /**
     * 乐观锁
     */
    private String onclick;

    /**
     * 创建日期
     */
    private Date createTime;

    /**
     * 创建人
     */
    private String createCode;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 更新人
     */
    private String updateCode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserNum() {
        return userNum;
    }

    public void setUserNum(String userNum) {
        this.userNum = userNum == null ? null : userNum.trim();
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode == null ? null : orgCode.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getLastLogingTime() {
        return lastLogingTime;
    }

    public void setLastLogingTime(Date lastLogingTime) {
        this.lastLogingTime = lastLogingTime;
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag == null ? null : deleteFlag.trim();
    }

    public String getOnclick() {
        return onclick;
    }

    public void setOnclick(String onclick) {
        this.onclick = onclick == null ? null : onclick.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateCode() {
        return createCode;
    }

    public void setCreateCode(String createCode) {
        this.createCode = createCode == null ? null : createCode.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateCode() {
        return updateCode;
    }

    public void setUpdateCode(String updateCode) {
        this.updateCode = updateCode == null ? null : updateCode.trim();
    }
}