package cn.wares.commodity.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cn.wares.commodity.entity.GoodsType;
import cn.wares.commodity.service.GoodsTypeService;

@RestController
@RequestMapping("/goodstype")
public class GoodsTypeController {

    @Autowired
    private GoodsTypeService goodsTypeService;

    /**
     * 查询所有记录
     *
     * @return 返回集合，没有返回空List
     */
    @RequestMapping("list")
    public List<GoodsType> listAll() {
        return goodsTypeService.listAll();
    }


    /**
     * 根据主键查询
     *
     * @param id 主键
     * @return 返回记录，没有返回null
     */
    @RequestMapping("getById")
    public GoodsType getById(Integer id) {
        return goodsTypeService.getById(id);
    }    
     
    /**
     * 新增，忽略null字段
     *
     * @param goodsType 新增的记录
     * @return 返回影响行数
     */
    @RequestMapping("insert")
    public int insert(@RequestBody GoodsType goodsType) {
        return goodsTypeService.insertIgnoreNull(goodsType);
    }    
      
    /**
     * 修改，忽略null字段
     *
     * @param goodsType 修改的记录
     * @return 返回影响行数
     */
    @RequestMapping("update")
    public int update(@RequestBody GoodsType goodsType) {
        return goodsTypeService.updateIgnoreNull(goodsType);
    }
    
    /**
     * 删除记录
     *
     * @param goodsType 待删除的记录
     * @return 返回影响行数
     */
    @RequestMapping("delete")
    public int delete(@RequestBody GoodsType goodsType) {
        return goodsTypeService.delete(goodsType);
    }
    
}