package cn.wares.commodity.entity;


import com.baomidou.mybatisplus.annotation.TableField;

/**
 * 用户表
 */
public class User {
    /** 用户id */
    private Integer id;
    /** 用户姓名 */
    private String userName;
    /** 用户性别（0男，1女） */
    private String userSex;
    /** 用户身份证 */
    private String userIdentity;
    /** 手机（注册字段） */
    private String phone;
    /** 密码 */
    private String password;
    /** 角色 */
    private Integer roleId;
    /** 是否删除（0未删除，1删除） */
    private Integer isDelete;

    private String tokenId;

    @TableField(exist = false)
    private Role role;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return this.id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserSex() {
        return this.userSex;
    }

    public void setUserIdentity(String userIdentity) {
        this.userIdentity = userIdentity;
    }

    public String getUserIdentity() {
        return this.userIdentity;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getRoleId() {
        return this.roleId;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Integer getIsDelete() {
        return this.isDelete;
    }

    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userSex='" + userSex + '\'' +
                ", userIdentity='" + userIdentity + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", roleId=" + roleId +
                ", isDelete=" + isDelete +
                ", tokenId='" + tokenId + '\'' +
                ", role=" + role +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) { return true; }
        if (o == null || getClass() != o.getClass()) {return false;}
        User that = (User) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(id);
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

}