package com.giit.www.mapper;

import com.giit.www.entity.Fileinfos;
import com.giit.www.entity.FileinfosExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FileinfosMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fileinfos
     *
     * @mbggenerated Sun Jul 02 13:07:31 CST 2017
     */
    int countByExample(FileinfosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fileinfos
     *
     * @mbggenerated Sun Jul 02 13:07:31 CST 2017
     */
    int deleteByExample(FileinfosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fileinfos
     *
     * @mbggenerated Sun Jul 02 13:07:31 CST 2017
     */
    int deleteByPrimaryKey(String fileid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fileinfos
     *
     * @mbggenerated Sun Jul 02 13:07:31 CST 2017
     */
    int insert(Fileinfos record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fileinfos
     *
     * @mbggenerated Sun Jul 02 13:07:31 CST 2017
     */
    int insertSelective(Fileinfos record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fileinfos
     *
     * @mbggenerated Sun Jul 02 13:07:31 CST 2017
     */
    List<Fileinfos> selectByExample(FileinfosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fileinfos
     *
     * @mbggenerated Sun Jul 02 13:07:31 CST 2017
     */
    Fileinfos selectByPrimaryKey(String fileid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fileinfos
     *
     * @mbggenerated Sun Jul 02 13:07:31 CST 2017
     */
    int updateByExampleSelective(@Param("record") Fileinfos record, @Param("example") FileinfosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fileinfos
     *
     * @mbggenerated Sun Jul 02 13:07:31 CST 2017
     */
    int updateByExample(@Param("record") Fileinfos record, @Param("example") FileinfosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fileinfos
     *
     * @mbggenerated Sun Jul 02 13:07:31 CST 2017
     */
    int updateByPrimaryKeySelective(Fileinfos record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fileinfos
     *
     * @mbggenerated Sun Jul 02 13:07:31 CST 2017
     */
    int updateByPrimaryKey(Fileinfos record);
}