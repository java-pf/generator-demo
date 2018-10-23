package com.demo.dao;

import com.demo.model.TableTest;
import com.demo.model.TableTestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TableTestMapper {
    long countByExample(TableTestExample example);

    int deleteByExample(TableTestExample example);

    int deleteByPrimaryKey(Integer testid);

    int insert(TableTest record);

    int insertSelective(TableTest record);

    List<TableTest> selectByExample(TableTestExample example);

    TableTest selectByPrimaryKey(Integer testid);

    int updateByExampleSelective(@Param("record") TableTest record, @Param("example") TableTestExample example);

    int updateByExample(@Param("record") TableTest record, @Param("example") TableTestExample example);

    int updateByPrimaryKeySelective(TableTest record);

    int updateByPrimaryKey(TableTest record);
}