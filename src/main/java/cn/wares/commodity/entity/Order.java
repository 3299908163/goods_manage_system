package cn.wares.commodity.entity;

import java.util.Date;

/**
 * 订单表
 */
public class Order {
    /** 主键 */
    private Integer id;
    /** 用户id */
    private Integer userId;
    /** 用户地址 */
    private String userAddress;
    /** 总消费 */
    private Double cost;
    /** 创建时间 */
    private Date createtime;

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

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserAddress() {
        return this.userAddress;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Double getCost() {
        return this.cost;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getCreatetime() {
        return this.createtime;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) { return true; }
        if (o == null || getClass() != o.getClass()) {return false;}
        Order that = (Order) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ",userId='" + userId + "'" +
                ",userAddress='" + userAddress + "'" +
                ",cost='" + cost + "'" +
                ",createtime='" + createtime + "'" +
                '}';
    }

}