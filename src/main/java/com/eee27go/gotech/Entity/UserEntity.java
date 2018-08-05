package com.eee27go.gotech.Entity;

import java.util.Date;

/**
 * By: eee27
 * Date: 2018/8/1 21:50
 */
public class UserEntity {
    private Integer userId;

    private String userName;

    private String loginName;

    private String email;

    private String phone;

    private String password;

    private Integer roleLevel;

    private Integer status;

    private Date regTime;

    private String regIp;

    private Date lastLoginTime;

    private String lastLoginIp;

    private Integer del;
    
    
    public Integer getUserId() {
        return userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    
    public String getUserName() {
        return userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public String getLoginName() {
        return loginName;
    }
    
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getPhone() {
        return phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public Integer getRoleLevel() {
        return roleLevel;
    }
    
    public void setRoleLevel(Integer roleLevel) {
        this.roleLevel = roleLevel;
    }
    
    public Integer getStatus() {
        return status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }
    
    public Date getRegTime() {
        return regTime;
    }
    
    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }
    
    public String getRegIp() {
        return regIp;
    }
    
    public void setRegIp(String regIp) {
        this.regIp = regIp;
    }
    
    public Date getLastLoginTime() {
        return lastLoginTime;
    }
    
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }
    
    public String getLastLoginIp() {
        return lastLoginIp;
    }
    
    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }
    
    public Integer getDel() {
        return del;
    }
    
    public void setDel(Integer del) {
        this.del = del;
    }
}
