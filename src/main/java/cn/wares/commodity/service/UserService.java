package cn.wares.commodity.service;

import cn.wares.commodity.entity.User;
import cn.wares.commodity.mapper.UserMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 查询所有记录
     *
     * @return 返回集合，没有返回空List
     */
    public List<User> listAll() {
    	return userMapper.listAll();
    }

    public IPage<User> getPageUser(Page page,String phone,String userName,int roleId){
        IPage<User> pageUser = userMapper.selectPageUser(page,phone,userName,roleId);
        for(User pageInfo:pageUser.getRecords()){
            if("0".equals(pageInfo.getUserSex())){
                pageInfo.setUserSex("男");
            }else {
                pageInfo.setUserSex("女");
            }
        }
        return pageUser;
    }

    public int getUserCount (String phone,String userName,int roleId){
        return userMapper.count(phone,userName,roleId);
    }

    /**
     * 根据主键查询
     *
     * @param id 主键
     * @return 返回记录，没有返回null
     */
    public User getById(Integer id) {
    	return userMapper.getById(id);
    }
	
    /**
     * 新增，插入所有字段
     *
     * @param user 新增的记录
     * @return 返回影响行数
     */
    public int insert(User user) {
    	return userMapper.insert(user);
    }
	
    /**
     * 新增，忽略null字段
     *
     * @param user 新增的记录
     * @return 返回影响行数
     */
    public int insertIgnoreNull(User user) {
    	return userMapper.insertIgnoreNull(user);
    }
	
    /**
     * 修改，修改所有字段
     *
     * @param user 修改的记录
     * @return 返回影响行数
     */
    public int update(User user) {
    	return userMapper.update(user);
    }
	
    /**
     * 修改，忽略null字段
     *
     * @param user 修改的记录
     * @return 返回影响行数
     */
    public int updateIgnoreNull(User user) {
    	return userMapper.updateIgnoreNull(user);
    }
	
    /**
     * 删除记录
     *
     * @param user 待删除的记录
     * @return 返回影响行数
     */
    public int delete(User user) {
    	return userMapper.delete(user);
    }
	
}