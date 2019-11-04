package cn.lf.Minitea.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.lf.Minitea.dto.PageMenuVM;
import cn.lf.Minitea.po.Menu;

@Service
public interface MenuService extends BaseService<Menu, Integer> {

	// 根据菜单ID查询子菜单
	public List<Menu> getByPid(Integer pid) throws Exception;
	
	// 查询所有菜单封装成vm
	public List<PageMenuVM> getMenuVm() throws Exception;
	
}
