package cn.lf.Minitea.service;

import org.springframework.stereotype.Service;

import cn.lf.Minitea.po.MiniteaPic;

@Service
public interface MiniteaPicService extends BaseService<MiniteaPic, Integer> {
	
	// 根据id查找
	public MiniteaPic getById (Integer id) throws Exception; 
}
