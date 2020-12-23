package cn.wares.commodity.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import cn.wares.commodity.entity.GoodsType;

@Mapper
public interface GoodsTypeMapper {

    /**
     * 查询所有记录
     *
     * @return 返回集合，没有返回空List
     */
    List<GoodsType> listAll();


    /**
     * 根据主键查询
     *
     * @param id 主键
     * @return 返回记录，没有返回null
     */
    GoodsType getById(Integer id);

    /**
     * 新增，插入所有字段
     *
     * @param goodsType 新增的记录
     * @return 返回影响行数
     */
    int insert(GoodsType goodsType);

    /**
     * 新增，忽略null字段
     *
     * @param goodsType 新增的记录
     * @return 返回影响行数
     */
    int insertIgnoreNull(GoodsType goodsType);

    /**
     * 修改，修改所有字段
     *
     * @param goodsType 修改的记录
     * @return 返回影响行数
     */
    int update(GoodsType goodsType);

    /**
     * 修改，忽略null字段
     *
     * @param goodsType 修改的记录
     * @return 返回影响行数
     */
    int updateIgnoreNull(GoodsType goodsType);

    /**
     * 删除记录
     *
     * @param goodsType 待删除的记录
     * @return 返回影响行数
     */
    int delete(GoodsType goodsType);

}