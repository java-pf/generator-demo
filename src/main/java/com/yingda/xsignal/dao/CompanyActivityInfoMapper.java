package com.yingda.xsignal.dao;

import com.yingda.xsignal.model.CompanyActivityInfo;
import com.yingda.xsignal.model.CompanyActivityInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanyActivityInfoMapper {
    long countByExample(CompanyActivityInfoExample example);

    int deleteByExample(CompanyActivityInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CompanyActivityInfo record);

    int insertSelective(CompanyActivityInfo record);

    List<CompanyActivityInfo> selectByExampleWithBLOBs(CompanyActivityInfoExample example);

    List<CompanyActivityInfo> selectByExample(CompanyActivityInfoExample example);

    CompanyActivityInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CompanyActivityInfo record, @Param("example") CompanyActivityInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") CompanyActivityInfo record, @Param("example") CompanyActivityInfoExample example);

    int updateByExample(@Param("record") CompanyActivityInfo record, @Param("example") CompanyActivityInfoExample example);

    int updateByPrimaryKeySelective(CompanyActivityInfo record);

    int updateByPrimaryKeyWithBLOBs(CompanyActivityInfo record);

    int updateByPrimaryKey(CompanyActivityInfo record);
}