package com.sky.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SetmealDishMapper {
    /**
     * 根据菜品ID查询对应的套餐ID
     * @param dishIds
     * @return
     */
    List<Long> getSetMealsByDishIds(List<Long> dishIds);
}
