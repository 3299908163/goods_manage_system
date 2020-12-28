package cn.wares.commodity.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cn.wares.commodity.entity.Role;
import cn.wares.commodity.service.RoleService;

@RestController
@RequestMapping("role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    /**
     * 查询所有记录
     *
     * @return 返回集合，没有返回空List
     */
    @RequestMapping("list")
    public List<Role> listAll() {
        return roleService.listAll();
    }


    /**
     * 根据主键查询
     *
     * @param id 主键
     * @return 返回记录，没有返回null
     */
    @RequestMapping("getById")
    public Role getById(Integer id) {
        return roleService.getById(id);
    }    
     
    /**
     * 新增，忽略null字段
     *
     * @param role 新增的记录
     * @return 返回影响行数
     */
    @RequestMapping("insert")
    public int insert(Role role) {
        return roleService.insertIgnoreNull(role);
    }    
      
    /**
     * 修改，忽略null字段
     *
     * @param role 修改的记录
     * @return 返回影响行数
     */
    @RequestMapping("update")
    public int update(@RequestBody Role role) {
        return roleService.updateIgnoreNull(role);
    }
    
    /**
     * 删除记录
     *
     * @param role 待删除的记录
     * @return 返回影响行数
     */
    @RequestMapping("delete")
    public int delete(@RequestBody Role role) {
        return roleService.delete(role);
    }
    
}