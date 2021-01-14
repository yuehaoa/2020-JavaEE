package cn.edu.xmu.timer.mapper;

import cn.edu.xmu.timer.model.po.ParamPo;
import cn.edu.xmu.timer.model.po.ParamPoExample;
import java.util.List;

public interface ParamPoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table timer_param
     *
     * @mbg.generated
     */
    int deleteByExample(ParamPoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table timer_param
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table timer_param
     *
     * @mbg.generated
     */
    int insert(ParamPo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table timer_param
     *
     * @mbg.generated
     */
    int insertSelective(ParamPo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table timer_param
     *
     * @mbg.generated
     */
    List<ParamPo> selectByExample(ParamPoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table timer_param
     *
     * @mbg.generated
     */
    ParamPo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table timer_param
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ParamPo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table timer_param
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ParamPo record);
}