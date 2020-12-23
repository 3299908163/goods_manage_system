package cn.wares.commodity.entity;


/**
 * 订单详解表2
 */
public class Detail {
	/** 主键 */
	private Integer id;
	/** 订单id */
	private Integer orderId;
	/** 商品id */
	private Integer goodsId;
	/** 数量 */
	private Integer number;
	/** 价格 */
	private Double price;

	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getId() {
		return this.id;
	}
	
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	
	public Integer getOrderId() {
		return this.orderId;
	}
	
	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}
	
	public Integer getGoodsId() {
		return this.goodsId;
	}
	
	public void setNumber(Integer number) {
		this.number = number;
	}
	
	public Integer getNumber() {
		return this.number;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Double getPrice() {
		return this.price;
	}
	

	@Override
    public boolean equals(Object o) {
        if (this == o) { return true; }
        if (o == null || getClass() != o.getClass()) {return false;}
        Detail that = (Detail) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(id);
    }
    
    @Override
    public String toString() {
        return "Detail{" +
				"id=" + id +
						",orderId='" + orderId + "'" + 
						",goodsId='" + goodsId + "'" + 
						",number='" + number + "'" + 
						",price='" + price + "'" + 
		                '}';
    }
	
}