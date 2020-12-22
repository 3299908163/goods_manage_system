package cn.wares.commodity.dao;

import cn.wares.commodity.entity.User;

public interface UserMapper {
    //根据主键删除信息
    int deleteByPrimaryKey(Integer id);
    //添加
    int insert(User record);
    //有选择的添加信息
    int insertSelective(User record);
    //根据主键查询信息
    User selectByPrimaryKey(Integer id);
    //根据主键有选择的修改信息
    int updateByPrimaryKeySelective(User record);
    //根据主键修改信息
    int updateByPrimaryKey(User record);
}