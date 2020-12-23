package cn.wares.commodity.entity;

import java.util.Date;

/**
 * 注册时间信息表
 */
public class RegisterInfo {
    /** id */
    private Integer id;
    /** 注册姓名 */
    private String registerName;
    /** 注册时间 */
    private Date registerTime;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return this.id;
    }

    public void setRegisterName(String registerName) {
        this.registerName = registerName;
    }

    public String getRegisterName() {
        return this.registerName;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public Date getRegisterTime() {
        return this.registerTime;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) { return true; }
        if (o == null || getClass() != o.getClass()) {return false;}
        RegisterInfo that = (RegisterInfo) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(id);
    }

    @Override
    public String toString() {
        return "RegisterInfo{" +
                "id=" + id +
                ",registerName='" + registerName + "'" +
                ",registerTime='" + registerTime + "'" +
                '}';
    }

}