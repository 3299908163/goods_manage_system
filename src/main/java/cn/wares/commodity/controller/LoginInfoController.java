package cn.wares.commodity.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cn.wares.commodity.entity.LoginInfo;
import cn.wares.commodity.service.LoginInfoService;

@RestController
@RequestMapping("/logininfo")
public class LoginInfoController {

    @Autowired
    private LoginInfoService loginInfoService;

    /**
     * 查询所有记录
     *
     * @return 返回集合，没有返回空List
     */
    @RequestMapping("list")
    public List<LoginInfo> listAll() {
        return loginInfoService.listAll();
    }


    /**
     * 根据主键查询
     *
     * @param id 主键
     * @return 返回记录，没有返回null
     */
    @RequestMapping("getById")
    public LoginInfo getById(Integer id) {
        return loginInfoService.getById(id);
    }    
     
    /**
     * 新增，忽略null字段
     *
     * @param loginName 新增的记录
     * @return 返回影响行数
     */
    @RequestMapping("insert")
    public int insert(String loginName) {
        return loginInfoService.insertIgnoreNull(loginName);
    }    
      
    /**
     * 修改，忽略null字段
     *
     * @param loginInfo 修改的记录
     * @return 返回影响行数
     */
    @RequestMapping("update")
    public int update(@RequestBody LoginInfo loginInfo) {
        return loginInfoService.updateIgnoreNull(loginInfo);
    }
    
    /**
     * 删除记录
     *
     * @param loginInfo 待删除的记录
     * @return 返回影响行数
     */
    @RequestMapping("delete")
    public int delete(@RequestBody LoginInfo loginInfo) {
        return loginInfoService.delete(loginInfo);
    }
    
}