package com.lhj.minitea.api;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lhj.minitea.po.FontCss;
import com.lhj.minitea.service.FontCssService;

@RestController
@RequestMapping("/api/fontCss")
public class FontCssAPI {
	
	@Autowired
	private FontCssService fontCssService;
	
	@RequestMapping("/getCssById")
	public FontCss getCssById(Integer id,HttpSession session, HttpServletRequest request,
			HttpServletResponse response)throws Exception{
		return fontCssService.getFontCssById(2);
	}
}
