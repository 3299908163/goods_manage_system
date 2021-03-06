package cn.wares.commodity.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import cn.wares.commodity.entity.UserAddress;

@Mapper
public interface UserAddressMapper {

    /**
     * 查询所有记录
     *
     * @return 返回集合，没有返回空List
     */
    List<UserAddress> listAll();


    /**
     * 根据主键查询
     *
     * @param id 主键
     * @return 返回记录，没有返回null
     */
    UserAddress getById(Integer id);

    /**
     * 新增，插入所有字段
     *
     * @param userAddress 新增的记录
     * @return 返回影响行数
     */
    int insert(UserAddress userAddress);

    /**
     * 新增，忽略null字段
     *
     * @param userAddress 新增的记录
     * @return 返回影响行数
     */
    int insertIgnoreNull(UserAddress userAddress);

    /**
     * 修改，修改所有字段
     *
     * @param userAddress 修改的记录
     * @return 返回影响行数
     */
    int update(UserAddress userAddress);

    /**
     * 修改，忽略null字段
     *
     * @param userAddress 修改的记录
     * @return 返回影响行数
     */
    int updateIgnoreNull(UserAddress userAddress);

    /**
     * 删除记录
     *
     * @param userAddress 待删除的记录
     * @return 返回影响行数
     */
    int delete(UserAddress userAddress);

}