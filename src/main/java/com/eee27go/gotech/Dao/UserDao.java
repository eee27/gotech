package com.eee27go.gotech.Dao;

import com.eee27go.gotech.Entity.UserEntity;

import java.util.List;

/**
 * By: eee27
 * Date: 2018/8/1 21:49
 */
public interface UserDao {

    int deleteByPrimaryKey(Integer userId);

    int insert(UserEntity record);

    int insertSelective(UserEntity record);

    UserEntity selectByPrimaryKey(Integer userId);
    
    List<UserEntity> selectAll();
    
    int selectCount(UserEntity record);

    int updateByPrimaryKeySelective(UserEntity record);

    int updateByPrimaryKey(UserEntity record);
}
