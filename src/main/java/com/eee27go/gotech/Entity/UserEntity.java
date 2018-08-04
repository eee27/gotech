package com.eee27go.gotech.Entity;

import java.util.Date;

/**
 * By: eee27
 * Date: 2018/8/1 21:50
 */
public class UserEntity {
    private Integer intUserId;

    private String vchrUserName;

    private String vchrLoginName;

    private String vchrEmail;

    private String vchrPhone;

    private String vchrPassword;

    private Integer intRoleLevel;

    private Integer intStatus;

    private Date dtmeRegTime;

    private String vchrRegIp;

    private Date dtmeLastLoginTime;

    private String vchrLastLoginIp;

    private Integer isDel;

    public Integer getIntUserId() {
        return intUserId;
    }

    public void setIntUserId(Integer intUserId) {
        this.intUserId = intUserId;
    }

    public String getVchrUserName() {
        return vchrUserName;
    }

    public void setVchrUserName(String vchrUserName) {
        this.vchrUserName = vchrUserName == null ? null : vchrUserName.trim();
    }

    public String getVchrLoginName() {
        return vchrLoginName;
    }

    public void setVchrLoginName(String vchrLoginName) {
        this.vchrLoginName = vchrLoginName == null ? null : vchrLoginName.trim();
    }

    public String getVchrEmail() {
        return vchrEmail;
    }

    public void setVchrEmail(String vchrEmail) {
        this.vchrEmail = vchrEmail == null ? null : vchrEmail.trim();
    }

    public String getVchrPhone() {
        return vchrPhone;
    }

    public void setVchrPhone(String vchrPhone) {
        this.vchrPhone = vchrPhone == null ? null : vchrPhone.trim();
    }

    public String getVchrPassword() {
        return vchrPassword;
    }

    public void setVchrPassword(String vchrPassword) {
        this.vchrPassword = vchrPassword == null ? null : vchrPassword.trim();
    }

    public Integer getIntRoleLevel() {
        return intRoleLevel;
    }

    public void setIntRoleLevel(Integer intRoleLevel) {
        this.intRoleLevel = intRoleLevel;
    }

    public Integer getIntStatus() {
        return intStatus;
    }

    public void setIntStatus(Integer intStatus) {
        this.intStatus = intStatus;
    }

    public Date getDtmeRegTime() {
        return dtmeRegTime;
    }

    public void setDtmeRegTime(Date dtmeRegTime) {
        this.dtmeRegTime = dtmeRegTime;
    }

    public String getVchrRegIp() {
        return vchrRegIp;
    }

    public void setVchrRegIp(String vchrRegIp) {
        this.vchrRegIp = vchrRegIp == null ? null : vchrRegIp.trim();
    }

    public Date getDtmeLastLoginTime() {
        return dtmeLastLoginTime;
    }

    public void setDtmeLastLoginTime(Date dtmeLastLoginTime) {
        this.dtmeLastLoginTime = dtmeLastLoginTime;
    }

    public String getVchrLastLoginIp() {
        return vchrLastLoginIp;
    }

    public void setVchrLastLoginIp(String vchrLastLoginIp) {
        this.vchrLastLoginIp = vchrLastLoginIp == null ? null : vchrLastLoginIp.trim();
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

}
