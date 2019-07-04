package com.lhj.minitea.service;


import org.springframework.stereotype.Service;

import com.lhj.minitea.po.FontCss;

@Service
public interface FontCssService {
	
	//根据ID查询字体
	public FontCss getFontCssById(Integer id) throws Exception;
	
}
