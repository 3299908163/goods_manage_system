package cn.wares.commodity.service;

import cn.wares.commodity.entity.LoginInfo;
import cn.wares.commodity.mapper.LoginInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginInfoService {

    @Autowired
    private LoginInfoMapper loginInfoMapper;

    /**
     * 查询所有记录
     *
     * @return 返回集合，没有返回空List
     */
    public List<LoginInfo> listAll() {
    	return loginInfoMapper.listAll();
    }


    /**
     * 根据主键查询
     *
     * @param id 主键
     * @return 返回记录，没有返回null
     */
    public LoginInfo getById(Integer id) {
    	return loginInfoMapper.getById(id);
    }
	
    /**
     * 新增，插入所有字段
     *
     * @param loginInfo 新增的记录
     * @return 返回影响行数
     */
    public int insert(LoginInfo loginInfo) {
    	return loginInfoMapper.insert(loginInfo);
    }
	
    /**
     * 新增，忽略null字段
     *
     * @param loginInfo 新增的记录
     * @return 返回影响行数
     */
    public int insertIgnoreNull(LoginInfo loginInfo) {
    	return loginInfoMapper.insertIgnoreNull(loginInfo);
    }
	
    /**
     * 修改，修改所有字段
     *
     * @param loginInfo 修改的记录
     * @return 返回影响行数
     */
    public int update(LoginInfo loginInfo) {
    	return loginInfoMapper.update(loginInfo);
    }
	
    /**
     * 修改，忽略null字段
     *
     * @param loginInfo 修改的记录
     * @return 返回影响行数
     */
    public int updateIgnoreNull(LoginInfo loginInfo) {
    	return loginInfoMapper.updateIgnoreNull(loginInfo);
    }
	
    /**
     * 删除记录
     *
     * @param loginInfo 待删除的记录
     * @return 返回影响行数
     */
    public int delete(LoginInfo loginInfo) {
    	return loginInfoMapper.delete(loginInfo);
    }
	
}