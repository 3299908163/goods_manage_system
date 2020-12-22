package cn.wares.commodity.entity;

import java.util.Date;

/**
 * 登陆信息表
 */
public class LoginInfo {
    private Integer id;

    private String loginName;

    private Date loginDate;

    public LoginInfo(Integer id, String loginName, Date loginDate) {
        this.id = id;
        this.loginName = loginName;
        this.loginDate = loginDate;
    }

    public LoginInfo() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }
}