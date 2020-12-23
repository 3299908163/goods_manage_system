package cn.wares.commodity.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import cn.wares.commodity.entity.Order;

@Mapper
public interface OrderMapper {

    /**
     * 查询所有记录
     *
     * @return 返回集合，没有返回空List
     */
    List<Order> listAll();


    /**
     * 根据主键查询
     *
     * @param id 主键
     * @return 返回记录，没有返回null
     */
    Order getById(Integer id);

    /**
     * 新增，插入所有字段
     *
     * @param order 新增的记录
     * @return 返回影响行数
     */
    int insert(Order order);

    /**
     * 新增，忽略null字段
     *
     * @param order 新增的记录
     * @return 返回影响行数
     */
    int insertIgnoreNull(Order order);

    /**
     * 修改，修改所有字段
     *
     * @param order 修改的记录
     * @return 返回影响行数
     */
    int update(Order order);

    /**
     * 修改，忽略null字段
     *
     * @param order 修改的记录
     * @return 返回影响行数
     */
    int updateIgnoreNull(Order order);

    /**
     * 删除记录
     *
     * @param order 待删除的记录
     * @return 返回影响行数
     */
    int delete(Order order);

}