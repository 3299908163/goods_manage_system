package cn.wares.commodity.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Mapper;
import cn.wares.commodity.entity.User;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

    /**
     * 查询所有记录
     *
     * @return 返回集合，没有返回空List
     */
    List<User> listAll();

    /**
     * 分页查询用户
     * @param page
     * @param phone
     * @param userName
     * @param roleId
     * @return
     */
    IPage<User> selectPageUser(Page page, @Param("phone")String phone,@Param("userName")String userName,@Param("roleId")int roleId);

    /**
     * 返回查询总数
     * @param phone
     * @param userName
     * @param roleId
     * @return
     */
    int count(@Param("phone")String phone,@Param("userName")String userName,@Param("roleId")int roleId);

    /**
     * 根据主键查询
     *
     * @param id 主键
     * @return 返回记录，没有返回null
     */
    User getById(Integer id);

    /**
     * 新增，忽略null字段
     *
     * @param user 新增的记录
     * @return 返回影响行数
     */
    int insertIgnoreNull(User user);

    /**
     * 修改，修改所有字段
     *
     * @param user 修改的记录
     * @return 返回影响行数
     */
    int update(User user);

    /**
     * 修改，忽略null字段
     *
     * @param user 修改的记录
     * @return 返回影响行数
     */
    int updateIgnoreNull(User user);

    /**
     * 删除记录
     *
     * @param user 待删除的记录
     * @return 返回影响行数
     */
    int delete(User user);

}