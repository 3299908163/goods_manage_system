package cn.wares.commodity.entity;

import java.util.Date;

public class User {
    private Integer id;

    private String username;

    private String password;

    private Integer sex;

    private Date entryDate;

    private Date leaveDate;

    private Integer age;

    private String phone;

    private String email;

    private Integer roleid;

    private Integer userstate;

    public User(Integer id, String username, String password, Integer sex, Date entryDate, Date leaveDate, Integer age, String phone, String email, Integer roleid, Integer userstate) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.sex = sex;
        this.entryDate = entryDate;
        this.leaveDate = leaveDate;
        this.age = age;
        this.phone = phone;
        this.email = email;
        this.roleid = roleid;
        this.userstate = userstate;
    }

    public User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public Date getLeaveDate() {
        return leaveDate;
    }

    public void setLeaveDate(Date leaveDate) {
        this.leaveDate = leaveDate;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public Integer getUserstate() {
        return userstate;
    }

    public void setUserstate(Integer userstate) {
        this.userstate = userstate;
    }
}