package com.lhj.minitea.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.lhj.minitea.po.Pageconfig;



@Service
public interface PageConfigService {
	
	//查询出所有配置
	public List<Pageconfig> getPageConfigAll() throws Exception;
	
	//根据ID查询配置
	public Pageconfig getPageConfigById(Integer id) throws Exception;
	
	
	//根据ID删除配置
	public int delPageConfigById(Integer id) throws Exception;
	
	//增加配置
	public int addPageConfig(Pageconfig pageconfig)throws Exception;
	
	//修改配置
	public int updatePageConfig(Pageconfig pageconfig)throws Exception;
}
