package com.dugzzuli.dug.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.dugzzuli.dug.entity.Category;


public interface CategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbg.generated Sat Aug 11 10:23:05 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbg.generated Sat Aug 11 10:23:05 CST 2018
     */
    int insert(Category record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbg.generated Sat Aug 11 10:23:05 CST 2018
     */
    int insertSelective(Category record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbg.generated Sat Aug 11 10:23:05 CST 2018
     */
    Category selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbg.generated Sat Aug 11 10:23:05 CST 2018
     */
    int updateByPrimaryKeySelective(Category record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbg.generated Sat Aug 11 10:23:05 CST 2018
     */
    int updateByPrimaryKey(Category record);
    
    
    List<Category> selectAll();

	List<Category> selectCategory(@Param("category")String category);
}