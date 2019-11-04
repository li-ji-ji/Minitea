package cn.lf.Minitea.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.lf.Minitea.dto.AdminMenuVM;
import cn.lf.Minitea.mapper.extend.MiniteaMenuMapperExtends;
import cn.lf.Minitea.po.MiniteaMenu;
import cn.lf.Minitea.po.MiniteaMenuExample;
import cn.lf.Minitea.service.MiniteaMenuService;

@Service
public class MiniteaMenuServiceImpl implements MiniteaMenuService {

	@Autowired
	private MiniteaMenuMapperExtends menuMapper;
	
	@Override
	public List<MiniteaMenu> getAll() throws Exception {
		return menuMapper.selectByExample(null);
	}

	@Override
	public int add(MiniteaMenu menu) throws Exception {
		menu.setpName(getById(menu.getpId()).getMenuName());
		return menuMapper.insertSelective(menu);
	}

	@Override
	public int update(MiniteaMenu menu) throws Exception {
		return menuMapper.updateByPrimaryKeySelective(menu);
	}

	@Override
	public int delete(Integer id) throws Exception {
		return menuMapper.deleteByPrimaryKey(id);
	}

	//根据ID查询菜单
	@Override
	public MiniteaMenu getById(Integer id) throws Exception{
		return menuMapper.selectByPrimaryKey(id);
	}
	
	//根据Pid查询已启用菜单
	public List<MiniteaMenu> getByPid(Integer pId) throws Exception{
		MiniteaMenuExample example=new MiniteaMenuExample();
		MiniteaMenuExample.Criteria criteria = example.createCriteria();
		criteria.andPIdEqualTo(pId);
		criteria.andMenuStatusEqualTo(1);
		return menuMapper.selectByExample(example);
	}
	
	//查询所有菜单并封装
	public List<AdminMenuVM> getMenuVM() throws Exception{
		List<AdminMenuVM> vms=new ArrayList<AdminMenuVM>();
		List<MiniteaMenu> firstMenus=getByPid(0);
		for(MiniteaMenu menu:firstMenus) {
			AdminMenuVM vm= new AdminMenuVM();
			BeanUtils.copyProperties(menu, vm);
			vm.setMenus(getByPid(menu.getId()));
			vms.add(vm);
		}
//		System.out.println(vms.toString());
		return vms;
	}
}
