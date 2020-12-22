package cn.wares.commodity.entity;

public class Detail {
    private Integer id;

    private Integer orderId;

    private Integer goodsId;

    private Integer number;

    private Double price;

    public Detail(Integer id, Integer orderId, Integer goodsId, Integer number, Double price) {
        this.id = id;
        this.orderId = orderId;
        this.goodsId = goodsId;
        this.number = number;
        this.price = price;
    }

    public Detail() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}