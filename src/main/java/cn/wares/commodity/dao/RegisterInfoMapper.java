package cn.wares.commodity.dao;

import cn.wares.commodity.entity.RegisterInfo;

public interface RegisterInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RegisterInfo record);

    int insertSelective(RegisterInfo record);

    RegisterInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RegisterInfo record);

    int updateByPrimaryKey(RegisterInfo record);
}