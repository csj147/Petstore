package com.nf147.dao;

import com.nf147.entity.Tag;
import java.util.List;

public interface TagMapper {
    int deleteByPrimaryKey(Integer t_id);

    int insert(Tag record);

    Tag selectByPrimaryKey(Integer t_id);

    List<Tag> selectAll();

    int updateByPrimaryKey(Tag record);
}