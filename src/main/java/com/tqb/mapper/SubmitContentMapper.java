package com.tqb.mapper;

import com.tqb.pojo.SubmitContent;
import com.tqb.pojo.SubmitContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubmitContentMapper {
    int countByExample(SubmitContentExample example);

    int deleteByExample(SubmitContentExample example);

    int deleteByPrimaryKey(Integer scId);

    int insert(SubmitContent record);

    int insertSelective(SubmitContent record);

    List<SubmitContent> selectByExample(SubmitContentExample example);

    SubmitContent selectByPrimaryKey(Integer scId);

    int updateByExampleSelective(@Param("record") SubmitContent record, @Param("example") SubmitContentExample example);

    int updateByExample(@Param("record") SubmitContent record, @Param("example") SubmitContentExample example);

    int updateByPrimaryKeySelective(SubmitContent record);

    int updateByPrimaryKey(SubmitContent record);
}