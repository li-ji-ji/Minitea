package cn.lf.Minitea.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.lf.Minitea.dto.AdminMenuVM;
import cn.lf.Minitea.po.MiniteaMenu;

@Service
public interface MiniteaMenuService extends BaseService<MiniteaMenu, Integer> {

	//根据ID查询菜单
	public MiniteaMenu getById(Integer id) throws Exception;
	
	//根据Pid查询菜单
	public List<MiniteaMenu> getByPid(Integer pId) throws Exception;
	
	//查询所有菜单并封装
	public List<AdminMenuVM> getMenuVM() throws Exception;
	
	//
}
