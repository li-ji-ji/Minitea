package com.lhj.minitea.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lhj.minitea.mapper.MenuMapper;
import com.lhj.minitea.po.Menu;
import com.lhj.minitea.po.MenuExample;
import com.lhj.minitea.service.MenuService;
import com.lhj.minitea.vm.MenuVM;


@Service
public class MenuServiceImpl implements MenuService {

	
	@Autowired
	private MenuMapper menuMapper;
	
	
	@Override
	public List<MenuVM> getMenu() throws Exception {
		MenuExample example=new MenuExample();
		MenuExample.Criteria criteria=example.createCriteria();
		criteria.andPidEqualTo(0);
		List<Menu> menus=menuMapper.selectByExample(example);
		System.out.println(menus);
		List<MenuVM> vms=new ArrayList<>();
		MenuVM menuVM=null;
		for(Menu menu:menus) {
			menuVM=new MenuVM();
			System.out.println(menuVM);
			BeanUtils.copyProperties(menu, menuVM);
			List<Menu> sub=getMenuByPid(menu.getId());
			System.out.println(sub);
			menuVM.setMenus(sub);
			vms.add(menuVM);
		}	
		return vms;
	}

	
	
	@Override
	public List<Menu> getMenuAll() throws Exception {
		List<Menu> menus=menuMapper.selectByExample(null);
		System.out.println(menus);
		return menus;
	}

	@Override
	public int addMenuAll(Menu menu) throws Exception {
		try {
			menuMapper.insertSelective(menu);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}

	@Override
	public int delMenuById(Integer id) throws Exception {
		try {
			menuMapper.deleteByPrimaryKey(id);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}

	@Override
	public int updateMenuById(Menu menu) throws Exception {
		try {
			menuMapper.updateByPrimaryKeySelective(menu);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}

	@Override
	public Menu getMenuById(Integer id) throws Exception {
		return null;
	}



	@Override
	public List<Menu> getMenuByPid(Integer pid) throws Exception {
		MenuExample example=new MenuExample();
		MenuExample.Criteria criteria=example.createCriteria();
		criteria.andPidEqualTo(pid);
		
		return menuMapper.selectByExample(example);
	}

	

}
