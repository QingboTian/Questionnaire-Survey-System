package com.tqb.mapper;

import com.tqb.pojo.ContentAnswer;
import com.tqb.pojo.ContentAnswerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContentAnswerMapper {
    int countByExample(ContentAnswerExample example);

    int deleteByExample(ContentAnswerExample example);

    int deleteByPrimaryKey(Integer caId);

    int insert(ContentAnswer record);

    int insertSelective(ContentAnswer record);

    List<ContentAnswer> selectByExample(ContentAnswerExample example);

    ContentAnswer selectByPrimaryKey(Integer caId);

    int updateByExampleSelective(@Param("record") ContentAnswer record, @Param("example") ContentAnswerExample example);

    int updateByExample(@Param("record") ContentAnswer record, @Param("example") ContentAnswerExample example);

    int updateByPrimaryKeySelective(ContentAnswer record);

    int updateByPrimaryKey(ContentAnswer record);
}