package cn.lf.Minitea.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.lf.Minitea.mapper.extend.PageconfigMapperExtends;
import cn.lf.Minitea.po.Pageconfig;
import cn.lf.Minitea.service.PageconfigService;

@Service
public class PageconfigServiceImpl implements PageconfigService {

	@Autowired
	private PageconfigMapperExtends confMapper;
	
	@Override
	public List<Pageconfig> getAll() throws Exception {
		return confMapper.selectByExample(null);
	}

	@Override
	public int add(Pageconfig t) throws Exception {
		return confMapper.insertSelective(t);
	}

	@Override
	public int update(Pageconfig t) throws Exception {
		return confMapper.updateByPrimaryKeySelective(t);
	}

	@Override
	public int delete(Integer id) throws Exception {
		return confMapper.deleteByPrimaryKey(id);
	}

}
