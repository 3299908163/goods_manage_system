package cn.wares.commodity.entity;


/**
 * 用户地址表
 */
public class userAddress {
    private Integer id;

    private Integer userId;

    private String address;

    private Integer isdefault;

    private String remark;

    public userAddress(Integer id, Integer userId, String address, Integer isdefault, String remark) {
        this.id = id;
        this.userId = userId;
        this.address = address;
        this.isdefault = isdefault;
        this.remark = remark;
    }

    public userAddress() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getIsdefault() {
        return isdefault;
    }

    public void setIsdefault(Integer isdefault) {
        this.isdefault = isdefault;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}