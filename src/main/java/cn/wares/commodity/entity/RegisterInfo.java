package cn.wares.commodity.entity;

import java.util.Date;

/**
 * 注册信息表
 */
public class RegisterInfo {
    private Integer id;

    private String registerName;

    private Date registerTime;

    public RegisterInfo(Integer id, String registerName, Date registerTime) {
        this.id = id;
        this.registerName = registerName;
        this.registerTime = registerTime;
    }

    public RegisterInfo() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRegisterName() {
        return registerName;
    }

    public void setRegisterName(String registerName) {
        this.registerName = registerName == null ? null : registerName.trim();
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }
}