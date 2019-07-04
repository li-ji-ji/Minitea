package com.lhj.minitea.mapper;

import com.lhj.minitea.po.Pageconfig;
import com.lhj.minitea.po.PageconfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PageconfigMapper {
    int countByExample(PageconfigExample example);

    int deleteByExample(PageconfigExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Pageconfig record);

    int insertSelective(Pageconfig record);

    List<Pageconfig> selectByExample(PageconfigExample example);

    Pageconfig selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Pageconfig record, @Param("example") PageconfigExample example);

    int updateByExample(@Param("record") Pageconfig record, @Param("example") PageconfigExample example);

    int updateByPrimaryKeySelective(Pageconfig record);

    int updateByPrimaryKey(Pageconfig record);
}