package cn.lf.Minitea.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.lf.Minitea.mapper.extend.PicMapperExtends;
import cn.lf.Minitea.po.MiniteaPic;
import cn.lf.Minitea.service.MiniteaPicService;
import cn.lf.Minitea.utils.TencentCOS;

@Service
public class MiniteaPicServiceImpl implements MiniteaPicService {

	@Autowired
	private PicMapperExtends picMapper;
	
	@Override
	public List<MiniteaPic> getAll() throws Exception {
		return picMapper.selectByExample(null);
	}

	@Override
	public int add(MiniteaPic pic) throws Exception {
		return picMapper.insertSelective(pic);
	}

	@Override
	public int update(MiniteaPic pic) throws Exception {
		return picMapper.updateByPrimaryKeySelective(pic);
	}

	@Override
	public int delete(Integer id) throws Exception {
		MiniteaPic pic= getById(id);
		TencentCOS.deletefile(pic.getPicKey());
		return picMapper.deleteByPrimaryKey(id);
	}
	

	// 根据id查找
	@Override
	public MiniteaPic getById (Integer id) throws Exception{
		return picMapper.selectByPrimaryKey(id);
	}

}
