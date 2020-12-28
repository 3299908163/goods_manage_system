package cn.wares.commodity.controller;

import java.util.List;

import cn.wares.commodity.entity.Detail;
import cn.wares.commodity.service.DetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("detail")
public class DetailController {

    @Autowired
    private DetailService detailService;

    /**
     * 查询所有记录
     *
     * @return 返回集合，没有返回空List
     */
    @RequestMapping("list")
    public List<Detail> listAll() {
        return detailService.listAll();
    }


    /**
     * 根据主键查询
     *
     * @param id 主键
     * @return 返回记录，没有返回null
     */
    @RequestMapping("getById")
    public Detail getById(Integer id) {
        return detailService.getById(id);
    }    
     
    /**
     * 新增，忽略null字段
     *
     * @param detail 新增的记录
     * @return 返回影响行数
     */
    @RequestMapping("insert")
    public int insert(@RequestBody Detail detail) {
        return detailService.insertIgnoreNull(detail);
    }    
      
    /**
     * 修改，忽略null字段
     *
     * @param detail 修改的记录
     * @return 返回影响行数
     */
    @RequestMapping("update")
    public int update(@RequestBody Detail detail) {
        return detailService.updateIgnoreNull(detail);
    }
    
    /**
     * 删除记录
     *
     * @param detail 待删除的记录
     * @return 返回影响行数
     */
    @RequestMapping("delete")
    public int delete(@RequestBody Detail detail) {
        return detailService.delete(detail);
    }
    
}