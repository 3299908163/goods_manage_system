package cn.wares.commodity.entity;

public class GoodsType {
    private Integer id;

    private String goodstypeName;

    private Integer level;

    private Integer parentId;

    public GoodsType(Integer id, String goodstypeName, Integer level, Integer parentId) {
        this.id = id;
        this.goodstypeName = goodstypeName;
        this.level = level;
        this.parentId = parentId;
    }

    public GoodsType() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodstypeName() {
        return goodstypeName;
    }

    public void setGoodstypeName(String goodstypeName) {
        this.goodstypeName = goodstypeName == null ? null : goodstypeName.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }
}