package cn.lf.Minitea.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.lf.Minitea.mapper.extend.MiniteaMenuMapperExtends;
import cn.lf.Minitea.po.MiniteaMenu;
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
		return menuMapper.insert(menu);
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
}
