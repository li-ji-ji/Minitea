package com.lhj.minitea.service;

import java.util.List;
import java.util.Map;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.lhj.minitea.po.Backmenu;
import com.lhj.minitea.vm.BackMenuVM;



@Service
public interface BackMenuService {

	public List<Backmenu> getAllMenu() throws Exception;
	
	public List<BackMenuVM> getMenu() throws Exception;
	//根据ID获取菜单url 
	public String getMenuUrlById(Integer id) throws Exception;
	//根据id获取菜单
	public Backmenu getMenuById(Integer id) throws Exception;
	
	//根据PID获取菜单
	public List<Backmenu> getMenuByPid(Integer pid) throws Exception;
	

	//根据表名查询数据表列名
	public List<Map> getName(String tableName) throws Exception;
}
