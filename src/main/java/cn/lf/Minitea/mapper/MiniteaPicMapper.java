package cn.lf.Minitea.mapper;

import cn.lf.Minitea.po.MiniteaPic;
import cn.lf.Minitea.po.MiniteaPicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MiniteaPicMapper {
    int countByExample(MiniteaPicExample example);

    int deleteByExample(MiniteaPicExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MiniteaPic record);

    int insertSelective(MiniteaPic record);

    List<MiniteaPic> selectByExample(MiniteaPicExample example);

    MiniteaPic selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MiniteaPic record, @Param("example") MiniteaPicExample example);

    int updateByExample(@Param("record") MiniteaPic record, @Param("example") MiniteaPicExample example);

    int updateByPrimaryKeySelective(MiniteaPic record);

    int updateByPrimaryKey(MiniteaPic record);
}