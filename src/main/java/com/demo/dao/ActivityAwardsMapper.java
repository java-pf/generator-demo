package com.demo.dao;

import com.demo.model.ActivityAwards;
import com.demo.model.ActivityAwardsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivityAwardsMapper {
    long countByExample(ActivityAwardsExample example);

    int deleteByExample(ActivityAwardsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ActivityAwards record);

    int insertSelective(ActivityAwards record);

    List<ActivityAwards> selectByExample(ActivityAwardsExample example);

    ActivityAwards selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ActivityAwards record, @Param("example") ActivityAwardsExample example);

    int updateByExample(@Param("record") ActivityAwards record, @Param("example") ActivityAwardsExample example);

    int updateByPrimaryKeySelective(ActivityAwards record);

    int updateByPrimaryKey(ActivityAwards record);
}