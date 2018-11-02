package com.nf147.dao;

import com.nf147.entity.User;
import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer u_id);

    int insert(User record);

    User selectByPrimaryKey(Integer u_id);

    List<User> selectAll();

    int updateByPrimaryKey(User record);
}