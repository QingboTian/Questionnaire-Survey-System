package com.tqb.mapper;

import com.tqb.pojo.SubmitInfo;
import com.tqb.pojo.SubmitInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubmitInfoMapper {
    int countByExample(SubmitInfoExample example);

    int deleteByExample(SubmitInfoExample example);

    int deleteByPrimaryKey(Integer siId);

    int insert(SubmitInfo record);

    int insertSelective(SubmitInfo record);

    List<SubmitInfo> selectByExample(SubmitInfoExample example);

    SubmitInfo selectByPrimaryKey(Integer siId);

    int updateByExampleSelective(@Param("record") SubmitInfo record, @Param("example") SubmitInfoExample example);

    int updateByExample(@Param("record") SubmitInfo record, @Param("example") SubmitInfoExample example);

    int updateByPrimaryKeySelective(SubmitInfo record);

    int updateByPrimaryKey(SubmitInfo record);
}