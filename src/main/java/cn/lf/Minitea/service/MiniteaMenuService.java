package cn.lf.Minitea.service;

import org.springframework.stereotype.Service;

import cn.lf.Minitea.po.MiniteaMenu;

@Service
public interface MiniteaMenuService extends BaseService<MiniteaMenu, Integer> {

	//根据ID查询菜单
	public MiniteaMenu getById(Integer id) throws Exception;
	
}
