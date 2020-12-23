package cn.wares.commodity.service;

import cn.wares.commodity.entity.GoodsType;
import cn.wares.commodity.mapper.GoodsTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsTypeService {

    @Autowired
    private GoodsTypeMapper goodsTypeMapper;

    /**
     * 查询所有记录
     *
     * @return 返回集合，没有返回空List
     */
    public List<GoodsType> listAll() {
    	return goodsTypeMapper.listAll();
    }


    /**
     * 根据主键查询
     *
     * @param id 主键
     * @return 返回记录，没有返回null
     */
    public GoodsType getById(Integer id) {
    	return goodsTypeMapper.getById(id);
    }
	
    /**
     * 新增，插入所有字段
     *
     * @param goodsType 新增的记录
     * @return 返回影响行数
     */
    public int insert(GoodsType goodsType) {
    	return goodsTypeMapper.insert(goodsType);
    }
	
    /**
     * 新增，忽略null字段
     *
     * @param goodsType 新增的记录
     * @return 返回影响行数
     */
    public int insertIgnoreNull(GoodsType goodsType) {
    	return goodsTypeMapper.insertIgnoreNull(goodsType);
    }
	
    /**
     * 修改，修改所有字段
     *
     * @param goodsType 修改的记录
     * @return 返回影响行数
     */
    public int update(GoodsType goodsType) {
    	return goodsTypeMapper.update(goodsType);
    }
	
    /**
     * 修改，忽略null字段
     *
     * @param goodsType 修改的记录
     * @return 返回影响行数
     */
    public int updateIgnoreNull(GoodsType goodsType) {
    	return goodsTypeMapper.updateIgnoreNull(goodsType);
    }
	
    /**
     * 删除记录
     *
     * @param goodsType 待删除的记录
     * @return 返回影响行数
     */
    public int delete(GoodsType goodsType) {
    	return goodsTypeMapper.delete(goodsType);
    }
	
}