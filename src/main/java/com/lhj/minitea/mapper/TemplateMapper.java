package com.lhj.minitea.mapper;

import com.lhj.minitea.po.Template;
import com.lhj.minitea.po.TemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TemplateMapper {
    int countByExample(TemplateExample example);

    int deleteByExample(TemplateExample example);

    int deleteByPrimaryKey(Integer tId);

    int insert(Template record);

    int insertSelective(Template record);

    List<Template> selectByExampleWithBLOBs(TemplateExample example);

    List<Template> selectByExample(TemplateExample example);

    Template selectByPrimaryKey(Integer tId);

    int updateByExampleSelective(@Param("record") Template record, @Param("example") TemplateExample example);

    int updateByExampleWithBLOBs(@Param("record") Template record, @Param("example") TemplateExample example);

    int updateByExample(@Param("record") Template record, @Param("example") TemplateExample example);

    int updateByPrimaryKeySelective(Template record);

    int updateByPrimaryKeyWithBLOBs(Template record);

    int updateByPrimaryKey(Template record);
}