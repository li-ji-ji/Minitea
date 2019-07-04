package com.lhj.minitea.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lhj.minitea.mapper.FontCssMapper;
import com.lhj.minitea.po.FontCss;
import com.lhj.minitea.service.FontCssService;

@Service
public class FontCssServiceImpl implements FontCssService {

	@Autowired
	private FontCssMapper fontCssMapper;
	@Override
	public FontCss getFontCssById(Integer id) throws Exception {
		return fontCssMapper.selectByPrimaryKey(id);
	}

}
