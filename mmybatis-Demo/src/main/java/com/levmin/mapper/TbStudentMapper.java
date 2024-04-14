package com.levmin.mapper;

import com.levmin.entity.TbStudent;
import com.levmin.entity.TbStudentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbStudentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_student
     *
     * @mbggenerated
     */
    int countByExample(TbStudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_student
     *
     * @mbggenerated
     */
    int deleteByExample(TbStudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_student
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_student
     *
     * @mbggenerated
     */
    int insert(TbStudent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_student
     *
     * @mbggenerated
     */
    int insertSelective(TbStudent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_student
     *
     * @mbggenerated
     */
    List<TbStudent> selectByExample(TbStudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_student
     *
     * @mbggenerated
     */
    TbStudent selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_student
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TbStudent record, @Param("example") TbStudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_student
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TbStudent record, @Param("example") TbStudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_student
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TbStudent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_student
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TbStudent record);
}