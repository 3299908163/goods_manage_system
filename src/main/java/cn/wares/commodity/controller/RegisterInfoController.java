package cn.wares.commodity.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cn.wares.commodity.entity.RegisterInfo;
import cn.wares.commodity.service.RegisterInfoService;

@RestController
@RequestMapping("register")
public class RegisterInfoController {

    @Autowired
    private RegisterInfoService registerInfoService;

    /**
     * 查询所有记录
     *
     * @return 返回集合，没有返回空List
     */
    @RequestMapping("list")
    public List<RegisterInfo> listAll() {
        return registerInfoService.listAll();
    }


    /**
     * 根据主键查询
     *
     * @param id 主键
     * @return 返回记录，没有返回null
     */
    @RequestMapping("getById")
    public RegisterInfo getById(Integer id) {
        return registerInfoService.getById(id);
    }    
     
    /**
     * 新增，忽略null字段
     *
     * @param registerName 新增的记录
     * @return 返回影响行数
     */
    @RequestMapping("insert")
    public int insert(String registerName) {
        return registerInfoService.insert(registerName);
    }    
      
    /**
     * 修改，忽略null字段
     *
     * @param registerInfo 修改的记录
     * @return 返回影响行数
     */
    @RequestMapping("update")
    public int update(@RequestBody RegisterInfo registerInfo) {
        return registerInfoService.updateIgnoreNull(registerInfo);
    }
    
    /**
     * 删除记录
     *
     * @param registerInfo 待删除的记录
     * @return 返回影响行数
     */
    @RequestMapping("delete")
    public int delete(@RequestBody RegisterInfo registerInfo) {
        return registerInfoService.delete(registerInfo);
    }
    
}