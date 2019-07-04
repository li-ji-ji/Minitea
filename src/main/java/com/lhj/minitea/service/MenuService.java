package com.lhj.minitea.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.lhj.minitea.po.Menu;
import com.lhj.minitea.vm.MenuVM;


@Service
public interface MenuService {
	//获取所有菜单并填入VM
	public List<MenuVM> getMenu() throws Exception;
	//获取所有菜单
	public List<Menu> getMenuAll()throws Exception;
	//根据PId获取菜单
	public List<Menu> getMenuByPid(Integer pid) throws Exception;
	//插入菜单
	public int addMenuAll(Menu menu) throws Exception;
	//根据ID删除菜单
	public int delMenuById(Integer id)throws Exception;
	//根据ID更新菜单
	public int updateMenuById(Menu menu) throws Exception;
	//根据ID查询菜单
	public Menu getMenuById(Integer id) throws Exception;
}
