package com.lhj.minitea.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.lhj.minitea.mapper.BackmenuMapper;
import com.lhj.minitea.mapper.SpecialMapper;
import com.lhj.minitea.po.Backmenu;
import com.lhj.minitea.po.BackmenuExample;
import com.lhj.minitea.service.BackMenuService;
import com.lhj.minitea.vm.BackMenuVM;


@Service
public class BackMenuServiceImpl implements BackMenuService {

	@Autowired
	private BackmenuMapper backmenuMapper;
	@Autowired
	private SpecialMapper specialMapper;
	
	@Override
	public List<BackMenuVM> getMenu() throws Exception {
		BackmenuExample example=new BackmenuExample();
		BackmenuExample.Criteria criteria=example.createCriteria();
		criteria.andPIdEqualTo(0);
		List<Backmenu> menus=backmenuMapper.selectByExample(example);
		System.out.println(menus);
		List<BackMenuVM> vms=new ArrayList<>();
		BackMenuVM menuVM=null;
		for(Backmenu menu:menus) {
			menuVM=new BackMenuVM();
			System.out.println("得到"+menus);
			System.out.println(menuVM);
			BeanUtils.copyProperties(menu, menuVM);
			List<Backmenu> sub=getMenuByPid(menu.getId());
			System.out.println(sub);
			menuVM.setMenus(sub);
			vms.add(menuVM);
		}		
		return vms;
	}
	@Override
	public String getMenuUrlById(Integer id) throws Exception {
		Backmenu menu=backmenuMapper.selectByPrimaryKey(id);
		return menu.getUrl();
	}
	@Override
	public List<Backmenu> getMenuByPid(Integer pid) throws Exception {
		BackmenuExample example=new BackmenuExample();
		BackmenuExample.Criteria criteria=example.createCriteria();
		criteria.andPIdEqualTo(pid);
		return backmenuMapper.selectByExample(example);
	}
	
	//根据返回的表名查询列名
	@Override
	public List<Map> getName(String tableName) throws Exception {
		// TODO Auto-generated method stub
		return specialMapper.getName(tableName);
	}
	//根据ID获取菜单
	@Override
	public Backmenu getMenuById(Integer id) throws Exception {
		return backmenuMapper.selectByPrimaryKey(id);
	}
	
	//获取所有菜单
	@Override
	public List<Backmenu> getAllMenu() throws Exception {
		return backmenuMapper.selectByExample(null);
	}
}
