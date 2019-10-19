package cn.lf.Minitea.mapper;

import cn.lf.Minitea.po.MiniteaMenu;
import cn.lf.Minitea.po.MiniteaMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MiniteaMenuMapper {
    int countByExample(MiniteaMenuExample example);

    int deleteByExample(MiniteaMenuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MiniteaMenu record);

    int insertSelective(MiniteaMenu record);

    List<MiniteaMenu> selectByExampleWithBLOBs(MiniteaMenuExample example);

    List<MiniteaMenu> selectByExample(MiniteaMenuExample example);

    MiniteaMenu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MiniteaMenu record, @Param("example") MiniteaMenuExample example);

    int updateByExampleWithBLOBs(@Param("record") MiniteaMenu record, @Param("example") MiniteaMenuExample example);

    int updateByExample(@Param("record") MiniteaMenu record, @Param("example") MiniteaMenuExample example);

    int updateByPrimaryKeySelective(MiniteaMenu record);

    int updateByPrimaryKeyWithBLOBs(MiniteaMenu record);

    int updateByPrimaryKey(MiniteaMenu record);
}