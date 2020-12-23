package cn.wares.commodity.service;

import cn.wares.commodity.entity.Goods;
import cn.wares.commodity.mapper.GoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    /**
     * 查询所有记录
     *
     * @return 返回集合，没有返回空List
     */
    public List<Goods> listAll() {
    	return goodsMapper.listAll();
    }


    /**
     * 根据主键查询
     *
     * @param id 主键
     * @return 返回记录，没有返回null
     */
    public Goods getById(Integer id) {
    	return goodsMapper.getById(id);
    }
	
    /**
     * 新增，插入所有字段
     *
     * @param goods 新增的记录
     * @return 返回影响行数
     */
    public int insert(Goods goods) {
    	return goodsMapper.insert(goods);
    }
	
    /**
     * 新增，忽略null字段
     *
     * @param goods 新增的记录
     * @return 返回影响行数
     */
    public int insertIgnoreNull(Goods goods) {
    	return goodsMapper.insertIgnoreNull(goods);
    }
	
    /**
     * 修改，修改所有字段
     *
     * @param goods 修改的记录
     * @return 返回影响行数
     */
    public int update(Goods goods) {
    	return goodsMapper.update(goods);
    }
	
    /**
     * 修改，忽略null字段
     *
     * @param goods 修改的记录
     * @return 返回影响行数
     */
    public int updateIgnoreNull(Goods goods) {
    	return goodsMapper.updateIgnoreNull(goods);
    }
	
    /**
     * 删除记录
     *
     * @param goods 待删除的记录
     * @return 返回影响行数
     */
    public int delete(Goods goods) {
    	return goodsMapper.delete(goods);
    }
	
}