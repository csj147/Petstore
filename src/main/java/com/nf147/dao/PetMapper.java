package com.nf147.dao;

import com.nf147.entity.Pet;
import java.util.List;

public interface PetMapper {
    int deleteByPrimaryKey(Integer pet_id);

    int insert(Pet record);

    Pet selectByPrimaryKey(Integer pet_id);

    List<Pet> selectAll();

    int updateByPrimaryKey(Pet record);

    List<Pet> select_join();

    List<Pet> select_id(Integer c_id);
}