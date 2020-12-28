package cn.wares.commodity.service;

import cn.wares.commodity.entity.Role;
import cn.wares.commodity.mapper.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {

    @Autowired
    private RoleMapper roleMapper;

    /**
     * 查询所有记录
     *
     * @return 返回集合，没有返回空List
     */
    public List<Role> listAll() {
    	return roleMapper.listAll();
    }


    /**
     * 根据主键查询
     *
     * @param id 主键
     * @return 返回记录，没有返回null
     */
    public Role getById(Integer id) {
    	return roleMapper.getById(id);
    }
	
    /**
     * 新增，忽略null字段
     *
     * @param role 新增的记录
     * @return 返回影响行数
     */
    public int insertIgnoreNull(Role role) {
    	return roleMapper.insertIgnoreNull(role);
    }
	
    /**
     * 修改，修改所有字段
     *
     * @param role 修改的记录
     * @return 返回影响行数
     */
    public int update(Role role) {
    	return roleMapper.update(role);
    }
	
    /**
     * 修改，忽略null字段
     *
     * @param role 修改的记录
     * @return 返回影响行数
     */
    public int updateIgnoreNull(Role role) {
    	return roleMapper.updateIgnoreNull(role);
    }
	
    /**
     * 删除记录
     *
     * @param role 待删除的记录
     * @return 返回影响行数
     */
    public int delete(Role role) {
    	return roleMapper.delete(role);
    }
	
}