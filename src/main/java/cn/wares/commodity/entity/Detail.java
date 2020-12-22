package cn.wares.commodity.entity;

/**
<<<<<<< HEAD
 * 订单详解表
=======
 * 订单详解表1
>>>>>>> 9b24adf75583691c35584661e227479e8b75b487
 */
public class Detail {
    private Integer id;

    private Integer orderId;    //订单id

    private Integer goodsId;    //商品id

    private Integer number;     //商品数量

    private Double price;       //商品价格

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