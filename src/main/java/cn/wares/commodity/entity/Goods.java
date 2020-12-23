package cn.wares.commodity.entity;


/**
 * 商品表
 */
public class Goods {
    /** 商品id */
    private Integer id;
    /** 商品名称 */
    private String goodsName;
    /** 商品图片路径 */
    private String goodsImage;
    /** 上架用户id */
    private Integer userId;
    /** 价格 */
    private Double price;
    /** 类型1 */
    private Integer goodsType1;
    /** 类型2 */
    private Integer goodsType2;
    /** 类型3 */
    private Integer goodsType3;
    /** 库存 */
    private Integer stock;
    /** 是否删除（0未删除，1删除） */
    private Integer isDelete;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return this.id;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsName() {
        return this.goodsName;
    }

    public void setGoodsImage(String goodsImage) {
        this.goodsImage = goodsImage;
    }

    public String getGoodsImage() {
        return this.goodsImage;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setGoodsType1(Integer goodsType1) {
        this.goodsType1 = goodsType1;
    }

    public Integer getGoodsType1() {
        return this.goodsType1;
    }

    public void setGoodsType2(Integer goodsType2) {
        this.goodsType2 = goodsType2;
    }

    public Integer getGoodsType2() {
        return this.goodsType2;
    }

    public void setGoodsType3(Integer goodsType3) {
        this.goodsType3 = goodsType3;
    }

    public Integer getGoodsType3() {
        return this.goodsType3;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getStock() {
        return this.stock;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Integer getIsDelete() {
        return this.isDelete;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) { return true; }
        if (o == null || getClass() != o.getClass()) {return false;}
        Goods that = (Goods) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ",goodsName='" + goodsName + "'" +
                ",goodsImage='" + goodsImage + "'" +
                ",userId='" + userId + "'" +
                ",price='" + price + "'" +
                ",goodsType1='" + goodsType1 + "'" +
                ",goodsType2='" + goodsType2 + "'" +
                ",goodsType3='" + goodsType3 + "'" +
                ",stock='" + stock + "'" +
                ",isDelete='" + isDelete + "'" +
                '}';
    }

}