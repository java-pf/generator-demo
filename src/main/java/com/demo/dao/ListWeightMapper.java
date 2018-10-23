package com.demo.dao;

import com.demo.model.ListWeight;
import com.demo.model.ListWeightExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ListWeightMapper {
    long countByExample(ListWeightExample example);

    int deleteByExample(ListWeightExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ListWeight record);

    int insertSelective(ListWeight record);

    List<ListWeight> selectByExample(ListWeightExample example);

    ListWeight selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ListWeight record, @Param("example") ListWeightExample example);

    int updateByExample(@Param("record") ListWeight record, @Param("example") ListWeightExample example);

    int updateByPrimaryKeySelective(ListWeight record);

    int updateByPrimaryKey(ListWeight record);
}