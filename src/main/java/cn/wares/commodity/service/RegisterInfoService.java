package cn.wares.commodity.service;

import cn.wares.commodity.entity.RegisterInfo;
import cn.wares.commodity.mapper.RegisterInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegisterInfoService {

    @Autowired
    private RegisterInfoMapper registerInfoMapper;

    /**
     * 查询所有记录
     *
     * @return 返回集合，没有返回空List
     */
    public List<RegisterInfo> listAll() {
    	return registerInfoMapper.listAll();
    }


    /**
     * 根据主键查询
     *
     * @param id 主键
     * @return 返回记录，没有返回null
     */
    public RegisterInfo getById(Integer id) {
    	return registerInfoMapper.getById(id);
    }
	
    /**
     * 新增，插入所有字段
     *
     * @param registerInfo 新增的记录
     * @return 返回影响行数
     */
    public int insert(RegisterInfo registerInfo) {
    	return registerInfoMapper.insert(registerInfo);
    }
	
    /**
     * 新增，忽略null字段
     *
     * @param registerInfo 新增的记录
     * @return 返回影响行数
     */
    public int insertIgnoreNull(RegisterInfo registerInfo) {
    	return registerInfoMapper.insertIgnoreNull(registerInfo);
    }
	
    /**
     * 修改，修改所有字段
     *
     * @param registerInfo 修改的记录
     * @return 返回影响行数
     */
    public int update(RegisterInfo registerInfo) {
    	return registerInfoMapper.update(registerInfo);
    }
	
    /**
     * 修改，忽略null字段
     *
     * @param registerInfo 修改的记录
     * @return 返回影响行数
     */
    public int updateIgnoreNull(RegisterInfo registerInfo) {
    	return registerInfoMapper.updateIgnoreNull(registerInfo);
    }
	
    /**
     * 删除记录
     *
     * @param registerInfo 待删除的记录
     * @return 返回影响行数
     */
    public int delete(RegisterInfo registerInfo) {
    	return registerInfoMapper.delete(registerInfo);
    }
	
}