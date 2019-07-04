package com.lhj.minitea.mapper;

import com.lhj.minitea.po.Backmenu;
import com.lhj.minitea.po.BackmenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BackmenuMapper {
    int countByExample(BackmenuExample example);

    int deleteByExample(BackmenuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Backmenu record);

    int insertSelective(Backmenu record);

    List<Backmenu> selectByExample(BackmenuExample example);

    Backmenu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Backmenu record, @Param("example") BackmenuExample example);

    int updateByExample(@Param("record") Backmenu record, @Param("example") BackmenuExample example);

    int updateByPrimaryKeySelective(Backmenu record);

    int updateByPrimaryKey(Backmenu record);
}