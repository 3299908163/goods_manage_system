package cn.wares.commodity.entity;

import java.util.Date;

public class Order {
    private Integer id;

    private Integer userId;

    private String userAddress;

    private Double cost;

    private Date createtime;

    public Order(Integer id, Integer userId, String userAddress, Double cost, Date createtime) {
        this.id = id;
        this.userId = userId;
        this.userAddress = userAddress;
        this.cost = cost;
        this.createtime = createtime;
    }

    public Order() {
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

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}