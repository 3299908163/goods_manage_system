package cn.wares.commodity.controller;

import cn.wares.commodity.entity.UserAddress;
import cn.wares.commodity.mapper.UserAddressMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserAddressService {

    @Autowired
    private UserAddressMapper userAddressMapper;

    /**
     * 查询所有记录
     *
     * @return 返回集合，没有返回空List
     */
    public List<UserAddress> listAll() {
    	return userAddressMapper.listAll();
    }


    /**
     * 根据主键查询
     *
     * @param id 主键
     * @return 返回记录，没有返回null
     */
    public UserAddress getById(Integer id) {
    	return userAddressMapper.getById(id);
    }
	
    /**
     * 新增，插入所有字段
     *
     * @param userAddress 新增的记录
     * @return 返回影响行数
     */
    public int insert(UserAddress userAddress) {
    	return userAddressMapper.insert(userAddress);
    }
	
    /**
     * 新增，忽略null字段
     *
     * @param userAddress 新增的记录
     * @return 返回影响行数
     */
    public int insertIgnoreNull(UserAddress userAddress) {
    	return userAddressMapper.insertIgnoreNull(userAddress);
    }
	
    /**
     * 修改，修改所有字段
     *
     * @param userAddress 修改的记录
     * @return 返回影响行数
     */
    public int update(UserAddress userAddress) {
    	return userAddressMapper.update(userAddress);
    }
	
    /**
     * 修改，忽略null字段
     *
     * @param userAddress 修改的记录
     * @return 返回影响行数
     */
    public int updateIgnoreNull(UserAddress userAddress) {
    	return userAddressMapper.updateIgnoreNull(userAddress);
    }
	
    /**
     * 删除记录
     *
     * @param userAddress 待删除的记录
     * @return 返回影响行数
     */
    public int delete(UserAddress userAddress) {
    	return userAddressMapper.delete(userAddress);
    }
	
}