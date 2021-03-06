package com.xzgl.www.mapper;

import com.xzgl.www.entity.Serviceinformation;
import com.xzgl.www.entity.ServiceinformationExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ServiceinformationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table serviceinformation
     *
     * @mbggenerated Sun Jul 09 18:41:44 CST 2017
     */
    int countByExample(ServiceinformationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table serviceinformation
     *
     * @mbggenerated Sun Jul 09 18:41:44 CST 2017
     */
    int deleteByExample(ServiceinformationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table serviceinformation
     *
     * @mbggenerated Sun Jul 09 18:41:44 CST 2017
     */
    int deleteByPrimaryKey(String bunumber);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table serviceinformation
     *
     * @mbggenerated Sun Jul 09 18:41:44 CST 2017
     */
    int insert(Serviceinformation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table serviceinformation
     *
     * @mbggenerated Sun Jul 09 18:41:44 CST 2017
     */
    int insertSelective(Serviceinformation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table serviceinformation
     *
     * @mbggenerated Sun Jul 09 18:41:44 CST 2017
     */
    List<Serviceinformation> selectByExample(ServiceinformationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table serviceinformation
     *
     * @mbggenerated Sun Jul 09 18:41:44 CST 2017
     */
    Serviceinformation selectByPrimaryKey(String bunumber);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table serviceinformation
     *
     * @mbggenerated Sun Jul 09 18:41:44 CST 2017
     */
    int updateByExampleSelective(@Param("record") Serviceinformation record, @Param("example") ServiceinformationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table serviceinformation
     *
     * @mbggenerated Sun Jul 09 18:41:44 CST 2017
     */
    int updateByExample(@Param("record") Serviceinformation record, @Param("example") ServiceinformationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table serviceinformation
     *
     * @mbggenerated Sun Jul 09 18:41:44 CST 2017
     */
    int updateByPrimaryKeySelective(Serviceinformation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table serviceinformation
     *
     * @mbggenerated Sun Jul 09 18:41:44 CST 2017
     */
    int updateByPrimaryKey(Serviceinformation record);

    List<Serviceinformation> findAll();
}