package com.lhj.minitea.mapper;

import com.lhj.minitea.po.Teadetail;
import com.lhj.minitea.po.TeadetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeadetailMapper {
    int countByExample(TeadetailExample example);

    int deleteByExample(TeadetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Teadetail record);

    int insertSelective(Teadetail record);

    List<Teadetail> selectByExample(TeadetailExample example);

    Teadetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Teadetail record, @Param("example") TeadetailExample example);

    int updateByExample(@Param("record") Teadetail record, @Param("example") TeadetailExample example);

    int updateByPrimaryKeySelective(Teadetail record);

    int updateByPrimaryKey(Teadetail record);
}