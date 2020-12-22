package cn.wares.commodity.dao;

import cn.wares.commodity.entity.userAddress;

public interface userAddressMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(userAddress record);

    int insertSelective(userAddress record);

    userAddress selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(userAddress record);

    int updateByPrimaryKey(userAddress record);
}