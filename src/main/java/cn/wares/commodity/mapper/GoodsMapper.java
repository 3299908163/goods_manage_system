package cn.wares.commodity.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import cn.wares.commodity.entity.Goods;

@Mapper
public interface GoodsMapper {

    /**
     * 查询所有记录
     *
     * @return 返回集合，没有返回空List
     */
    List<Goods> listAll();


    /**
     * 根据主键查询
     *
     * @param id 主键
     * @return 返回记录，没有返回null
     */
    Goods getById(Integer id);

    /**
     * 新增，插入所有字段
     *
     * @param goods 新增的记录
     * @return 返回影响行数
     */
    int insert(Goods goods);

    /**
     * 新增，忽略null字段
     *
     * @param goods 新增的记录
     * @return 返回影响行数
     */
    int insertIgnoreNull(Goods goods);

    /**
     * 修改，修改所有字段
     *
     * @param goods 修改的记录
     * @return 返回影响行数
     */
    int update(Goods goods);

    /**
     * 修改，忽略null字段
     *
     * @param goods 修改的记录
     * @return 返回影响行数
     */
    int updateIgnoreNull(Goods goods);

    /**
     * 删除记录
     *
     * @param goods 待删除的记录
     * @return 返回影响行数
     */
    int delete(Goods goods);

}