package cn.wares.commodity.controller;

import java.util.HashMap;
import java.util.List;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

import cn.wares.commodity.entity.User;
import cn.wares.commodity.service.UserService;

@RestController
@RequestMapping("/user")
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

    @RequestMapping("/userList")
    public Object listUser(@RequestParam(required = false) Integer page,
                           @RequestParam(required = false) Integer limit,
                           @RequestParam(required = false) int roleId,
                           @RequestParam(required = false) String userName,
                           @RequestParam(required = false) String phone){
        Page<User> ipage = new Page<>(page,limit);
        IPage<User> pageUser = userService.getPageUser(ipage,phone,userName,roleId);
        int count = userService.getUserCount(phone,userName,roleId);
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","分页查询成功");
        map.put("count",count);
        map.put("data",pageUser.getRecords());
        return map;

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
    @RequestMapping(value = "insert",method = RequestMethod.POST)
    public int insert(User user) {
        return userService.insertIgnoreNull(user);
    }    
      
    /**
     * 修改，忽略null字段
     *
     * @param user 修改的记录
     * @return 返回影响行数
     */
    @RequestMapping("update")
    public int update(User user) {
        return userService.updateIgnoreNull(user);
    }
    
    /**
     * 删除记录
     *
     * @param user 待删除的记录
     * @return 返回影响行数
     */
    @RequestMapping("delete")
    public int delete(User user) {
        return userService.delete(user);
    }
    
}