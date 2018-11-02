package com.nf147.dao;

import com.nf147.entity.Apiresponse;
import java.util.List;

public interface ApiresponseMapper {
    int deleteByPrimaryKey(Integer a_code);

    int insert(Apiresponse record);

    Apiresponse selectByPrimaryKey(Integer a_code);

    List<Apiresponse> selectAll();

    int updateByPrimaryKey(Apiresponse record);
}