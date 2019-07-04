package com.lhj.minitea.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.lhj.minitea.po.Pageconfig;
import com.lhj.minitea.service.PageConfigService;
import com.lhj.minitea.utils.LayUIJSON;


@Controller
@RequestMapping("/PageConfig")
public class PageConfigController {
	
	@Autowired
	private PageConfigService pageConfigService;

	@RequestMapping("/getAllPageConfig")
	@ResponseBody
	public LayUIJSON getPageConfigList() throws Exception {
		LayUIJSON layUIJSON = new LayUIJSON();
		layUIJSON.setData(pageConfigService.getPageConfigAll());
		System.out.println(layUIJSON);
		return layUIJSON;
	}
	
	@RequestMapping("/delPageConfigById")
	@ResponseBody
	public int delPageConfigById(HttpSession session, HttpServletRequest request, HttpServletResponse response,Integer id,Model model) throws Exception{
		int result;
		String getId=request.getParameter("id");
		id=Integer.valueOf(getId);
		System.out.println(id);
		result=pageConfigService.delPageConfigById(id);
		return result;
	}
	
	@RequestMapping("/updatePageConfigById")
	@ResponseBody
	public int updatePageConfigById(HttpSession session, HttpServletRequest request, HttpServletResponse response,Integer id,Model model) throws Exception{
		int result;
		String menuMsg=request.getParameter("menu");
		Pageconfig getMsg=JSON.parseObject(menuMsg, Pageconfig.class);
		System.out.println(getMsg);
		result=pageConfigService.updatePageConfig(getMsg);
		return result;
	}
	
	@RequestMapping("/addPageConfig")
	@ResponseBody
	public int addPageConfig(HttpSession session, HttpServletRequest request, HttpServletResponse response,Model model,String name, String status, String bgpic, String pic1, String pic2,
			String pic3, String pic4, String pic5, String value1, String value2, String value3, String value4,
			String value5, String value6, String value7, String value8, String value9, String value0) throws Exception{
		int result;
		String menuMsg=request.getParameter("menu");
		Pageconfig getMsg=JSON.parseObject(menuMsg, Pageconfig.class);
		result=pageConfigService.addPageConfig(getMsg);
		return result;
	}
}
