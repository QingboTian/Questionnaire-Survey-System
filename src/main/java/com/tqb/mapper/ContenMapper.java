package com.tqb.mapper;

import com.tqb.pojo.Conten;
import com.tqb.pojo.ContenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContenMapper {
    int countByExample(ContenExample example);

    int deleteByExample(ContenExample example);

    int deleteByPrimaryKey(Integer cId);

    int insert(Conten record);

    int insertSelective(Conten record);

    List<Conten> selectByExample(ContenExample example);

    Conten selectByPrimaryKey(Integer cId);

    int updateByExampleSelective(@Param("record") Conten record, @Param("example") ContenExample example);

    int updateByExample(@Param("record") Conten record, @Param("example") ContenExample example);

    int updateByPrimaryKeySelective(Conten record);

    int updateByPrimaryKey(Conten record);
}