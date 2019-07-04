package com.lhj.minitea.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Select;

public interface SpecialMapper {
	//查询数据表列名
		@Select("SELECT column_name,column_comment,DATA_TYPE FROM information_schema.columns WHERE table_schema ='minitea' AND table_name =#{tableName}")
		public List<Map> getName(String tableName) throws Exception;
}
