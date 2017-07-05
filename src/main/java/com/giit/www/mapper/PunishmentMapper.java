package com.giit.www.mapper;

import com.giit.www.entity.Punishment;
import com.giit.www.entity.PunishmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PunishmentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table punishment
     *
     * @mbggenerated Sun Jul 02 13:07:31 CST 2017
     */
    int countByExample(PunishmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table punishment
     *
     * @mbggenerated Sun Jul 02 13:07:31 CST 2017
     */
    int deleteByExample(PunishmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table punishment
     *
     * @mbggenerated Sun Jul 02 13:07:31 CST 2017
     */
    int deleteByPrimaryKey(String itemid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table punishment
     *
     * @mbggenerated Sun Jul 02 13:07:31 CST 2017
     */
    int insert(Punishment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table punishment
     *
     * @mbggenerated Sun Jul 02 13:07:31 CST 2017
     */
    int insertSelective(Punishment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table punishment
     *
     * @mbggenerated Sun Jul 02 13:07:31 CST 2017
     */
    List<Punishment> selectByExample(PunishmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table punishment
     *
     * @mbggenerated Sun Jul 02 13:07:31 CST 2017
     */
    Punishment selectByPrimaryKey(String itemid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table punishment
     *
     * @mbggenerated Sun Jul 02 13:07:31 CST 2017
     */
    int updateByExampleSelective(@Param("record") Punishment record, @Param("example") PunishmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table punishment
     *
     * @mbggenerated Sun Jul 02 13:07:31 CST 2017
     */
    int updateByExample(@Param("record") Punishment record, @Param("example") PunishmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table punishment
     *
     * @mbggenerated Sun Jul 02 13:07:31 CST 2017
     */
    int updateByPrimaryKeySelective(Punishment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table punishment
     *
     * @mbggenerated Sun Jul 02 13:07:31 CST 2017
     */
    int updateByPrimaryKey(Punishment record);
}