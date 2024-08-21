package com.sky.mapper;

import com.sky.entity.SetmealDish;
import org.apache.ibatis.annotations.Delete;
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

    /**
     * 插入套餐菜品信息
     * @param dishes
     */
    void insert(List<SetmealDish> dishes);

    /**
     * 删除套餐的菜品信息
     * @param id
     */
    @Delete("delete from sky_take_out.setmeal_dish where setmeal_id = #{id}")
    void delete(Long id);
}
