package cn.wares.commodity.controller;

import java.util.HashMap;
import java.util.List;

import cn.wares.commodity.service.LoginInfoService;
import cn.wares.commodity.service.RegisterInfoService;
import cn.wares.commodity.utils.ReturnResult;
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

    @Autowired
    private TokenManager tokenManager;

    @Autowired
    private RegisterInfoService registerInfoService;

    @Autowired
    private LoginInfoService loginInfoService;

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
     * 分页查询用户
     * @param page
     * @param limit
     * @param roleId
     * @param userName
     * @param phone
     * @return
     */
    @RequestMapping("/userList")
    public Object listUser(@RequestParam(required = false) Integer page,
                           @RequestParam(required = false) Integer limit,
                           @RequestParam(required = false) Integer roleId,
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
     * 登陆方法
     * @param phone
     * @param password
     * @return
     */
    @RequestMapping("/login")
    public Map<String,Object> login(@RequestParam String phone,
                                    @RequestParam String password){
        User user =userService.getUserByPhoneAndPassword(phone,password);
        Map<String,Object> map = null;
        if(null==user){
            if(null==userService.getUserByPhone(phone)){
//                为空返回5001，电话不存在
                map = ReturnResult.returnFail(null,null,5001);
            }else{
//                电话存在，密码不存在返回5002
                map = ReturnResult.returnFail(null,null,5002);
            }
        }else {
            loginInfoService.insertIgnoreNull(user.getUserName());
            user.setTokenId(tokenManager.createToken(user.getId()));
            userService.updateIgnoreNull(user);
            map = ReturnResult.returnSuccess(null,user.getTokenId());
        }
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
    public Object insert(User user) {
        User user1 = userService.getUserByPhone(user.getPhone());
        if (user1 !=null){      //不为空表示已经存在
            return ReturnResult.returnFail("用户已存在",null,"600");
        }
        int i = userService.insertIgnoreNull(user);
        if(i>0){
            registerInfoService.insert(user.getUserName());
            return ReturnResult.returnSuccess("注册成功",user.getUserName());
        }
        else {
            return ReturnResult.returnFail("注册失败",null,500);
        }
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