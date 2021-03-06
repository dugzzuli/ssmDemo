package com.dugzzuli.dug.service;

import java.util.List;

import com.dugzzuli.dug.entity.Category;
import com.dugzzuli.dug.entity.News;

public interface INewsService {
	/**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbg.generated Sat Aug 11 10:23:05 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbg.generated Sat Aug 11 10:23:05 CST 2018
     */
    int insert(News record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbg.generated Sat Aug 11 10:23:05 CST 2018
     */
    int insertSelective(News record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbg.generated Sat Aug 11 10:23:05 CST 2018
     */
    News selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbg.generated Sat Aug 11 10:23:05 CST 2018
     */
    int updateByPrimaryKeySelective(News record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbg.generated Sat Aug 11 10:23:05 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(News record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbg.generated Sat Aug 11 10:23:05 CST 2018
     */
    int updateByPrimaryKey(News record);

	List<News> selectAll();
	

	List<News> selectAllNews(String order, int count);

	List<News> selectHotNews(String string, int i);

	News selectModel(String string);
}
