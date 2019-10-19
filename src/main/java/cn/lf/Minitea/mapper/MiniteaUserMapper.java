package cn.lf.Minitea.mapper;

import cn.lf.Minitea.po.MiniteaUser;
import cn.lf.Minitea.po.MiniteaUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MiniteaUserMapper {
    int countByExample(MiniteaUserExample example);

    int deleteByExample(MiniteaUserExample example);

    int deleteByPrimaryKey(Integer uid);

    int insert(MiniteaUser record);

    int insertSelective(MiniteaUser record);

    List<MiniteaUser> selectByExample(MiniteaUserExample example);

    MiniteaUser selectByPrimaryKey(Integer uid);

    int updateByExampleSelective(@Param("record") MiniteaUser record, @Param("example") MiniteaUserExample example);

    int updateByExample(@Param("record") MiniteaUser record, @Param("example") MiniteaUserExample example);

    int updateByPrimaryKeySelective(MiniteaUser record);

    int updateByPrimaryKey(MiniteaUser record);
}