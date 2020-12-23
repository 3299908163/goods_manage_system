package cn.wares.commodity.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cn.wares.commodity.entity.UserAddress;
import cn.wares.commodity.service.UserAddressService;

@RestController
public class UserAddressController {

    @Autowired
    private UserAddressService userAddressService;

    /**
     * 查询所有记录
     *
     * @return 返回集合，没有返回空List
     */
    @RequestMapping("list")
    public List<UserAddress> listAll() {
        return userAddressService.listAll();
    }


    /**
     * 根据主键查询
     *
     * @param id 主键
     * @return 返回记录，没有返回null
     */
    @RequestMapping("getById")
    public UserAddress getById(Integer id) {
        return userAddressService.getById(id);
    }    
     
    /**
     * 新增，忽略null字段
     *
     * @param userAddress 新增的记录
     * @return 返回影响行数
     */
    @RequestMapping("insert")
    public int insert(@RequestBody UserAddress userAddress) {
        return userAddressService.insertIgnoreNull(userAddress);
    }    
      
    /**
     * 修改，忽略null字段
     *
     * @param userAddress 修改的记录
     * @return 返回影响行数
     */
    @RequestMapping("update")
    public int update(@RequestBody UserAddress userAddress) {
        return userAddressService.updateIgnoreNull(userAddress);
    }
    
    /**
     * 删除记录
     *
     * @param userAddress 待删除的记录
     * @return 返回影响行数
     */
    @RequestMapping("delete")
    public int delete(@RequestBody UserAddress userAddress) {
        return userAddressService.delete(userAddress);
    }
    
}