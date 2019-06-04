package com.qf.springboothello.mapper;

import com.qf.springboothello.entity.User;

/**
 * @author GuanYeFan
 * @Date 2019/6/3
 */
public interface UserMapper {
    int deleteByPrimaryKey(int id);

    int insert(User user);

    int insertSelective(User user);

    User selectByPrimaryKey(int id);

    int updateByPrimaryKeySelective(User user);

    int updateByPrimaryKey(User user);
}
