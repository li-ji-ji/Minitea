package cn.lf.Minitea.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.lf.Minitea.dto.PageMenuVM;
import cn.lf.Minitea.mapper.extend.MenuMapperExtends;
import cn.lf.Minitea.po.Menu;
import cn.lf.Minitea.po.MenuExample;
import cn.lf.Minitea.service.MenuService;

@Service
public class MenuServiceImpl implements MenuService {

	@Autowired
	private MenuMapperExtends menuMapper;
	
	@Override
	public List<Menu> getAll() throws Exception {
		return menuMapper.selectByExample(null);
	}

	@Override
	public int add(Menu t) throws Exception {
		return menuMapper.insertSelective(t);
	}

	@Override
	public int update(Menu t) throws Exception {
		return menuMapper.updateByPrimaryKeySelective(t);
	}

	@Override
	public int delete(Integer id) throws Exception {
		return menuMapper.deleteByPrimaryKey(id);
	}

	
	// 根据菜单ID查询子菜单
	@Override
	public List<Menu> getByPid(Integer pid) throws Exception{
		MenuExample example = new MenuExample();
		MenuExample.Criteria criteria = example.createCriteria();
		criteria.andPidEqualTo(pid);
		return menuMapper.selectByExample(example);
	}
	
	// 查询所有菜单封装成vm
	@Override
	public List<PageMenuVM> getMenuVm() throws Exception{
		List<Menu> firstMenus=getByPid(0);
		List<PageMenuVM> menus=new ArrayList<PageMenuVM>();
		for(Menu menu:firstMenus) {
			PageMenuVM menuVM = new PageMenuVM();
			menuVM.setMenus(getByPid(menu.getId()));
			BeanUtils.copyProperties(menu, menuVM);
			menus.add(menuVM);
		}
		return menus;
	}
	
}
