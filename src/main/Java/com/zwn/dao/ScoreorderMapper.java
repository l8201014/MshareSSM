package com.zwn.dao;

import com.zwn.model.Scoreorder;

public interface ScoreorderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scoreorder
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer omid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scoreorder
     *
     * @mbggenerated
     */
    int insert(Scoreorder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scoreorder
     *
     * @mbggenerated
     */
    int insertSelective(Scoreorder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scoreorder
     *
     * @mbggenerated
     */
    Scoreorder selectByPrimaryKey(Integer omid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scoreorder
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Scoreorder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scoreorder
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Scoreorder record);
}