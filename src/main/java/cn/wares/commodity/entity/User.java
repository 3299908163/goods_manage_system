package cn.wares.commodity.entity;

/**
 * 用户表
 */
public class User {
    private Integer id;

    private String userName;

    private Integer userSex;

    private String userIdentity;

    private String phone;

    private String password;

    private Integer roleId;

    private Integer isDelete;

    public User(Integer id, String userName, Integer userSex, String userIdentity, String phone, String password, Integer roleId, Integer isDelete) {
        this.id = id;
        this.userName = userName;
        this.userSex = userSex;
        this.userIdentity = userIdentity;
        this.phone = phone;
        this.password = password;
        this.roleId = roleId;
        this.isDelete = isDelete;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Integer getUserSex() {
        return userSex;
    }

    public void setUserSex(Integer userSex) {
        this.userSex = userSex;
    }

    public String getUserIdentity() {
        return userIdentity;
    }

    public void setUserIdentity(String userIdentity) {
        this.userIdentity = userIdentity == null ? null : userIdentity.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }
}