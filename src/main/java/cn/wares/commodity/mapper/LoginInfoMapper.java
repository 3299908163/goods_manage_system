package cn.wares.commodity.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import cn.wares.commodity.entity.LoginInfo;

@Mapper
public interface LoginInfoMapper {

    /**
     * 查询所有记录
     *
     * @return 返回集合，没有返回空List
     */
    List<LoginInfo> listAll();


    /**
     * 根据主键查询
     *
     * @param id 主键
     * @return 返回记录，没有返回null
     */
    LoginInfo getById(Integer id);

    /**
     * 新增，忽略null字段
     *
     * @param loginName 新增的记录
     * @return 返回影响行数
     */
    int insertIgnoreNull(String loginName);

    /**
     * 修改，修改所有字段
     *
     * @param loginInfo 修改的记录
     * @return 返回影响行数
     */
    int update(LoginInfo loginInfo);

    /**
     * 修改，忽略null字段
     *
     * @param loginInfo 修改的记录
     * @return 返回影响行数
     */
    int updateIgnoreNull(LoginInfo loginInfo);

    /**
     * 删除记录
     *
     * @param loginInfo 待删除的记录
     * @return 返回影响行数
     */
    int delete(LoginInfo loginInfo);

}