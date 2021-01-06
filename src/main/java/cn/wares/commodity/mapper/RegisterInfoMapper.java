package cn.wares.commodity.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import cn.wares.commodity.entity.RegisterInfo;

@Mapper
public interface RegisterInfoMapper {

    /**
     * 查询所有记录
     *
     * @return 返回集合，没有返回空List
     */
    List<RegisterInfo> listAll();


    /**
     * 根据主键查询
     *
     * @param id 主键
     * @return 返回记录，没有返回null
     */
    RegisterInfo getById(Integer id);

    /**
     * 新增，忽略null字段
     *
     * @param registerName 新增的记录
     * @return 返回影响行数
     */
    int insert(String registerName);

    /**
     * 修改，修改所有字段
     *
     * @param registerInfo 修改的记录
     * @return 返回影响行数
     */
    int update(RegisterInfo registerInfo);

    /**
     * 修改，忽略null字段
     *
     * @param registerInfo 修改的记录
     * @return 返回影响行数
     */
    int updateIgnoreNull(RegisterInfo registerInfo);

    /**
     * 删除记录
     *
     * @param registerInfo 待删除的记录
     * @return 返回影响行数
     */
    int delete(RegisterInfo registerInfo);

}