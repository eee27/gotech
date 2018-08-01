package com.eee27go.gotech.Dao;

import com.eee27go.gotech.Entity.UserEntity;

/**
 * By: eee27
 * Date: 2018/8/1 21:49
 */
public interface UserDao {

    int deleteByPrimaryKey(Integer intUserId);

    int insert(UserEntity record);

    int insertSelective(UserEntity record);

    UserEntity selectByPrimaryKey(Integer intUserId);

    int updateByPrimaryKeySelective(UserEntity record);

    int updateByPrimaryKey(UserEntity record);
}
