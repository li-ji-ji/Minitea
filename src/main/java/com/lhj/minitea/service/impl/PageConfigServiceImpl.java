package com.lhj.minitea.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lhj.minitea.mapper.PageconfigMapper;
import com.lhj.minitea.mapper.SpecialMapper;
import com.lhj.minitea.po.Pageconfig;
import com.lhj.minitea.po.PageconfigExample;
import com.lhj.minitea.service.PageConfigService;

@Service
public class PageConfigServiceImpl implements PageConfigService {
	
	@Autowired
	private PageconfigMapper pageConfigMapper;
	@Autowired
	private SpecialMapper specialMapper;

	PageconfigExample example=new PageconfigExample();
	PageconfigExample.Criteria criteria=example.createCriteria();
	
	
	@Override
	public List<Pageconfig> getPageConfigAll() throws Exception {
		
		return pageConfigMapper.selectByExample(null);
	}

	@Override
	public Pageconfig getPageConfigById(Integer id) throws Exception {
		
		return pageConfigMapper.selectByPrimaryKey(id);
	}

	@Override
	public int delPageConfigById(Integer id) throws Exception {
		try {
			pageConfigMapper.deleteByPrimaryKey(id);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}

	@Override
	public int addPageConfig(Pageconfig pageconfig) throws Exception {
		try {
			pageConfigMapper.insertSelective(pageconfig);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}

	@Override
	public int updatePageConfig(Pageconfig pageconfig) throws Exception {
		try {
			pageConfigMapper.updateByPrimaryKeySelective(pageconfig);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}

}
