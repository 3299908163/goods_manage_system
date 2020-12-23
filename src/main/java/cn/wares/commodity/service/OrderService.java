package cn.wares.commodity.service;

import cn.wares.commodity.entity.Order;
import cn.wares.commodity.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;

    /**
     * 查询所有记录
     *
     * @return 返回集合，没有返回空List
     */
    public List<Order> listAll() {
    	return orderMapper.listAll();
    }


    /**
     * 根据主键查询
     *
     * @param id 主键
     * @return 返回记录，没有返回null
     */
    public Order getById(Integer id) {
    	return orderMapper.getById(id);
    }
	
    /**
     * 新增，插入所有字段
     *
     * @param order 新增的记录
     * @return 返回影响行数
     */
    public int insert(Order order) {
    	return orderMapper.insert(order);
    }
	
    /**
     * 新增，忽略null字段
     *
     * @param order 新增的记录
     * @return 返回影响行数
     */
    public int insertIgnoreNull(Order order) {
    	return orderMapper.insertIgnoreNull(order);
    }
	
    /**
     * 修改，修改所有字段
     *
     * @param order 修改的记录
     * @return 返回影响行数
     */
    public int update(Order order) {
    	return orderMapper.update(order);
    }
	
    /**
     * 修改，忽略null字段
     *
     * @param order 修改的记录
     * @return 返回影响行数
     */
    public int updateIgnoreNull(Order order) {
    	return orderMapper.updateIgnoreNull(order);
    }
	
    /**
     * 删除记录
     *
     * @param order 待删除的记录
     * @return 返回影响行数
     */
    public int delete(Order order) {
    	return orderMapper.delete(order);
    }
	
}