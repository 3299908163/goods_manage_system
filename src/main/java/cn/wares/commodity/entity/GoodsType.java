package cn.wares.commodity.entity;


/**
 * 商品类型表
 */
public class GoodsType {
    /** id */
    private Integer id;
    /** 商品类型名称 */
    private String goodstypeName;
    /** 商品类型等级 */
    private Integer level;
    /** 父类id */
    private Integer parentId;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return this.id;
    }

    public void setGoodstypeName(String goodstypeName) {
        this.goodstypeName = goodstypeName;
    }

    public String getGoodstypeName() {
        return this.goodstypeName;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getLevel() {
        return this.level;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getParentId() {
        return this.parentId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) { return true; }
        if (o == null || getClass() != o.getClass()) {return false;}
        GoodsType that = (GoodsType) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(id);
    }

    @Override
    public String toString() {
        return "GoodsType{" +
                "id=" + id +
                ",goodstypeName='" + goodstypeName + "'" +
                ",level='" + level + "'" +
                ",parentId='" + parentId + "'" +
                '}';
    }

}