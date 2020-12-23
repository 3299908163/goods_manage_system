package cn.wares.commodity.service;

import cn.wares.commodity.entity.Detail;
import cn.wares.commodity.mapper.DetailMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetailService {

    @Autowired
    private DetailMapper detailMapper;

    /**
     * 查询所有记录
     *
     * @return 返回集合，没有返回空List
     */
    public List<Detail> listAll() {
    	return detailMapper.listAll();
    }


    /**
     * 根据主键查询
     *
     * @param id 主键
     * @return 返回记录，没有返回null
     */
    public Detail getById(Integer id) {
    	return detailMapper.getById(id);
    }
	
    /**
     * 新增，插入所有字段
     *
     * @param detail 新增的记录
     * @return 返回影响行数
     */
    public int insert(Detail detail) {
    	return detailMapper.insert(detail);
    }
	
    /**
     * 新增，忽略null字段
     *
     * @param detail 新增的记录
     * @return 返回影响行数
     */
    public int insertIgnoreNull(Detail detail) {
    	return detailMapper.insertIgnoreNull(detail);
    }
	
    /**
     * 修改，修改所有字段
     *
     * @param detail 修改的记录
     * @return 返回影响行数
     */
    public int update(Detail detail) {
    	return detailMapper.update(detail);
    }
	
    /**
     * 修改，忽略null字段
     *
     * @param detail 修改的记录
     * @return 返回影响行数
     */
    public int updateIgnoreNull(Detail detail) {
    	return detailMapper.updateIgnoreNull(detail);
    }
	
    /**
     * 删除记录
     *
     * @param detail 待删除的记录
     * @return 返回影响行数
     */
    public int delete(Detail detail) {
    	return detailMapper.delete(detail);
    }
	
}