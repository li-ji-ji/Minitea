package cn.lf.Minitea.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.lf.Minitea.po.MiniteaPic;

@Service
public interface MiniteaPicService {
	
	// 查询所有
	public List<MiniteaPic> getAll ()throws Exception;
	
	// 根据id查询
	public MiniteaPic getById(Integer id) throws Exception;
	
	// 添加
	public int addOne(MiniteaPic pic) throws Exception;
	
}
