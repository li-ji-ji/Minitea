package cn.lf.Minitea.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.lf.Minitea.mapper.extend.PicMapperExtends;
import cn.lf.Minitea.po.MiniteaPic;
import cn.lf.Minitea.service.MiniteaPicService;

@Service
public class MiniteaPicServiceImpl implements MiniteaPicService {

	@Autowired
	private PicMapperExtends picMapper;
	
	@Override
	public List<MiniteaPic> getAll() throws Exception {
		return picMapper.selectByExample(null);
	}

	// 根据id查询
	@Override
	public MiniteaPic getById(Integer id) throws Exception{
		return picMapper.selectByPrimaryKey(id);
	}

	@Override
	public int addOne(MiniteaPic pic) throws Exception {
		///
		return 0;
	}
}
