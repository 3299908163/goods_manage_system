package cn.wares.commodity.entity;

import java.util.Date;

/**
 * 登陆信息表
 */
public class LoginInfo {
    /** id */
    private Integer id;
    /** 登陆的用户名 */
    private String loginName;
    /** 登陆时间 */
    private Date loginDate;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return this.id;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginName() {
        return this.loginName;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    public Date getLoginDate() {
        return this.loginDate;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) { return true; }
        if (o == null || getClass() != o.getClass()) {return false;}
        LoginInfo that = (LoginInfo) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(id);
    }

    @Override
    public String toString() {
        return "LoginInfo{" +
                "id=" + id +
                ",loginName='" + loginName + "'" +
                ",loginDate='" + loginDate + "'" +
                '}';
    }

}