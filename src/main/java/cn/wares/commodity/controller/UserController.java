package cn.wares.commodity.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cn.wares.commodity.entity.User;
import cn.wares.commodity.service.UserService;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 查询所有记录
     *
     * @return 返回集合，没有返回空List
     */
    @RequestMapping("list")
    public List<User> listAll() {
        return userService.listAll();
    }


    /**
     * 根据主键查询
     *
     * @param id 主键
     * @return 返回记录，没有返回null
     */
    @RequestMapping("getById")
    public User getById(Integer id) {
        return userService.getById(id);
    }    
     
    /**
     * 新增，忽略null字段
     *
     * @param user 新增的记录
     * @return 返回影响行数
     */
    @RequestMapping("insert")
    public int insert(@RequestBody User user) {
        return userService.insertIgnoreNull(user);
    }    
      
    /**
     * 修改，忽略null字段
     *
     * @param user 修改的记录
     * @return 返回影响行数
     */
    @RequestMapping("update")
    public int update(@RequestBody User user) {
        return userService.updateIgnoreNull(user);
    }
    
    /**
     * 删除记录
     *
     * @param user 待删除的记录
     * @return 返回影响行数
     */
    @RequestMapping("delete")
    public int delete(@RequestBody User user) {
        return userService.delete(user);
    }
    
}