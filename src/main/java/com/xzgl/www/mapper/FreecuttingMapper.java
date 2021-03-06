package com.xzgl.www.mapper;

import com.xzgl.www.entity.Freecutting;
import com.xzgl.www.entity.FreecuttingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FreecuttingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecutting
     *
     * @mbggenerated Thu Jul 06 22:59:22 CST 2017
     */
    int countByExample(FreecuttingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecutting
     *
     * @mbggenerated Thu Jul 06 22:59:22 CST 2017
     */
    int deleteByExample(FreecuttingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecutting
     *
     * @mbggenerated Thu Jul 06 22:59:22 CST 2017
     */
    int deleteByPrimaryKey(String cutnumber);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecutting
     *
     * @mbggenerated Thu Jul 06 22:59:22 CST 2017
     */
    int insert(Freecutting record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecutting
     *
     * @mbggenerated Thu Jul 06 22:59:22 CST 2017
     */
    int insertSelective(Freecutting record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecutting
     *
     * @mbggenerated Thu Jul 06 22:59:22 CST 2017
     */
    List<Freecutting> selectByExample(FreecuttingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecutting
     *
     * @mbggenerated Thu Jul 06 22:59:22 CST 2017
     */
    Freecutting selectByPrimaryKey(String cutnumber);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecutting
     *
     * @mbggenerated Thu Jul 06 22:59:22 CST 2017
     */
    int updateByExampleSelective(@Param("record") Freecutting record, @Param("example") FreecuttingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecutting
     *
     * @mbggenerated Thu Jul 06 22:59:22 CST 2017
     */
    int updateByExample(@Param("record") Freecutting record, @Param("example") FreecuttingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecutting
     *
     * @mbggenerated Thu Jul 06 22:59:22 CST 2017
     */
    int updateByPrimaryKeySelective(Freecutting record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecutting
     *
     * @mbggenerated Thu Jul 06 22:59:22 CST 2017
     */
    int updateByPrimaryKey(Freecutting record);
}