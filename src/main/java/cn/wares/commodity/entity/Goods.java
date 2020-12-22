package cn.wares.commodity.entity;

/**
 * 商品表
 */
public class Goods {
    private Integer id;

    private String goodsName;

    private String goodsImage;

    private Integer userId;

    private Double price;

    private Integer goodsType1;

    private Integer goodsType2;

    private Integer goodsType3;

    private Integer stock;

    private Integer isDelete;

    public Goods(Integer id, String goodsName, String goodsImage, Integer userId, Double price, Integer goodsType1, Integer goodsType2, Integer goodsType3, Integer stock, Integer isDelete) {
        this.id = id;
        this.goodsName = goodsName;
        this.goodsImage = goodsImage;
        this.userId = userId;
        this.price = price;
        this.goodsType1 = goodsType1;
        this.goodsType2 = goodsType2;
        this.goodsType3 = goodsType3;
        this.stock = stock;
        this.isDelete = isDelete;
    }

    public Goods() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getGoodsImage() {
        return goodsImage;
    }

    public void setGoodsImage(String goodsImage) {
        this.goodsImage = goodsImage == null ? null : goodsImage.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getGoodsType1() {
        return goodsType1;
    }

    public void setGoodsType1(Integer goodsType1) {
        this.goodsType1 = goodsType1;
    }

    public Integer getGoodsType2() {
        return goodsType2;
    }

    public void setGoodsType2(Integer goodsType2) {
        this.goodsType2 = goodsType2;
    }

    public Integer getGoodsType3() {
        return goodsType3;
    }

    public void setGoodsType3(Integer goodsType3) {
        this.goodsType3 = goodsType3;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }
}