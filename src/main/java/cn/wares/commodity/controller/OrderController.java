package cn.wares.commodity.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cn.wares.commodity.entity.Order;
import cn.wares.commodity.service.OrderService;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     * 查询所有记录
     *
     * @return 返回集合，没有返回空List
     */
    @RequestMapping("list")
    public List<Order> listAll() {
        return orderService.listAll();
    }


    /**
     * 根据主键查询
     *
     * @param id 主键
     * @return 返回记录，没有返回null
     */
    @RequestMapping("getById")
    public Order getById(Integer id) {
        return orderService.getById(id);
    }    
     
    /**
     * 新增，忽略null字段
     *
     * @param order 新增的记录
     * @return 返回影响行数
     */
    @RequestMapping("insert")
    public int insert(@RequestBody Order order) {
        return orderService.insertIgnoreNull(order);
    }    
      
    /**
     * 修改，忽略null字段
     *
     * @param order 修改的记录
     * @return 返回影响行数
     */
    @RequestMapping("update")
    public int update(@RequestBody Order order) {
        return orderService.updateIgnoreNull(order);
    }
    
    /**
     * 删除记录
     *
     * @param order 待删除的记录
     * @return 返回影响行数
     */
    @RequestMapping("delete")
    public int delete(@RequestBody Order order) {
        return orderService.delete(order);
    }
    
}