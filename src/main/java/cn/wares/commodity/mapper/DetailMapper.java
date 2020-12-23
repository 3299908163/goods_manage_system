package cn.wares.commodity.mapper;

import java.util.List;

import cn.wares.commodity.entity.Detail;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DetailMapper {

    /**
     * 查询所有记录
     *
     * @return 返回集合，没有返回空List
     */
    List<Detail> listAll();


    /**
     * 根据主键查询
     *
     * @param id 主键
     * @return 返回记录，没有返回null
     */
    Detail getById(Integer id);

    /**
     * 新增，插入所有字段
     *
     * @param detail 新增的记录
     * @return 返回影响行数
     */
    int insert(Detail detail);

    /**
     * 新增，忽略null字段
     *
     * @param detail 新增的记录
     * @return 返回影响行数
     */
    int insertIgnoreNull(Detail detail);

    /**
     * 修改，修改所有字段
     *
     * @param detail 修改的记录
     * @return 返回影响行数
     */
    int update(Detail detail);

    /**
     * 修改，忽略null字段
     *
     * @param detail 修改的记录
     * @return 返回影响行数
     */
    int updateIgnoreNull(Detail detail);

    /**
     * 删除记录
     *
     * @param detail 待删除的记录
     * @return 返回影响行数
     */
    int delete(Detail detail);

}