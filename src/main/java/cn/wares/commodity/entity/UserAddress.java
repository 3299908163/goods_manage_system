package cn.wares.commodity.entity;


/**
 * 配送表
 */
public class UserAddress {
    /** 主键 */
    private Integer id;
    /** 用户id */
    private Integer userId;
    /** 地址 */
    private String address;
    /** 是否默认地址（1：是 0：否） */
    private Integer isdefault;
    /** 备注 */
    private String remark;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return this.id;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return this.address;
    }

    public void setIsdefault(Integer isdefault) {
        this.isdefault = isdefault;
    }

    public Integer getIsdefault() {
        return this.isdefault;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemark() {
        return this.remark;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) { return true; }
        if (o == null || getClass() != o.getClass()) {return false;}
        UserAddress that = (UserAddress) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(id);
    }

    @Override
    public String toString() {
        return "UserAddress{" +
                "id=" + id +
                ",userId='" + userId + "'" +
                ",address='" + address + "'" +
                ",isdefault='" + isdefault + "'" +
                ",remark='" + remark + "'" +
                '}';
    }

}