package com.nf147.dao;

import com.nf147.entity.Ordel;
import java.util.List;

public interface OrdelMapper {
    int deleteByPrimaryKey(Integer o_id);

    int insert(Ordel record);

    Ordel selectByPrimaryKey(Integer o_id);

    List<Ordel> selectAll();

    int updateByPrimaryKey(Ordel record);
}