package cn.wares.commodity.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cn.wares.commodity.entity.Goods;
import cn.wares.commodity.service.GoodsService;

@RestController
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    /**
     * 查询所有记录
     *
     * @return 返回集合，没有返回空List
     */
    @RequestMapping("list")
    public List<Goods> listAll() {
        return goodsService.listAll();
    }


    /**
     * 根据主键查询
     *
     * @param id 主键
     * @return 返回记录，没有返回null
     */
    @RequestMapping("getById")
    public Goods getById(Integer id) {
        return goodsService.getById(id);
    }    
     
    /**
     * 新增，忽略null字段
     *
     * @param goods 新增的记录
     * @return 返回影响行数
     */
    @RequestMapping("insert")
    public int insert(@RequestBody Goods goods) {
        return goodsService.insertIgnoreNull(goods);
    }    
      
    /**
     * 修改，忽略null字段
     *
     * @param goods 修改的记录
     * @return 返回影响行数
     */
    @RequestMapping("update")
    public int update(@RequestBody Goods goods) {
        return goodsService.updateIgnoreNull(goods);
    }
    
    /**
     * 删除记录
     *
     * @param goods 待删除的记录
     * @return 返回影响行数
     */
    @RequestMapping("delete")
    public int delete(@RequestBody Goods goods) {
        return goodsService.delete(goods);
    }
    
}