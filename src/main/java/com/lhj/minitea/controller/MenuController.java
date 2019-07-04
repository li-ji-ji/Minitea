package com.lhj.minitea.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.lhj.minitea.po.Menu;
import com.lhj.minitea.po.Pageconfig;
import com.lhj.minitea.service.MenuService;
import com.lhj.minitea.service.PageConfigService;
import com.lhj.minitea.utils.LayUIJSON;
import com.lhj.minitea.vm.MenuVM;


@Controller
@RequestMapping("/menu")
public class MenuController {

	@Autowired
	private MenuService menuService;
	@Autowired
	private PageConfigService pageConfigService;
	
	@RequestMapping("/getAll")
	public String getMenu(Model model)throws Exception{
		List<MenuVM> menus=menuService.getMenu();
		model.addAttribute("menus", menus);
		List<Pageconfig> pageConfigs=pageConfigService.getPageConfigAll();
		model.addAttribute("pageConfigs", pageConfigs);
		return "ftl/static/tea-page";
	}
	
	@RequestMapping("/getMenuList")
	@ResponseBody
	public LayUIJSON getMenuList() throws Exception {
		LayUIJSON layUIJSON = new LayUIJSON();
		layUIJSON.setData(menuService.getMenuAll());
//		System.out.println("菜单列表layui数据："+layUIJSON);
		return layUIJSON;
	}
	
	@RequestMapping("/addMenuAll")
	@ResponseBody
	public int getMenu(HttpSession session, HttpServletRequest request, HttpServletResponse response,Integer pid, String value, String url, Integer status)throws Exception{
		String menuMsg=request.getParameter("menu");
		Menu menu=JSON.parseObject(menuMsg, Menu.class);
		int result=menuService.addMenuAll(menu);
		return result;
	}
	
	@RequestMapping("/delMenuById")
	@ResponseBody
	public int delMenuById(HttpSession session, HttpServletRequest request, HttpServletResponse response,Integer id) throws Exception {
		id=Integer.valueOf(request.getParameter("id"));
		int result =menuService.delMenuById(id);
		return result;
		
	}
	
	@RequestMapping("/updateMenuById")
	@ResponseBody
	public int updateMenuById(HttpSession session, HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		
		String menuMsg=request.getParameter("menu");
		Menu menu=JSON.parseObject(menuMsg, Menu.class);
//		System.out.println("从页面获取的JSON数据"+menuMsg);
//		System.out.println("从页面获取转换成po的数据"+menu);
		int result=menuService.updateMenuById(menu);
		return result;
	}
	
	@RequestMapping("/getMenuById")
	@ResponseBody
	public String getMenuById(Model model,HttpSession session, HttpServletRequest request, HttpServletResponse response,Integer id) throws Exception{
		String getId=request.getParameter("id");
		id=Integer.valueOf(getId);
		Menu menu=menuService.getMenuById(id);
		model.addAttribute("menu",menu);
//		System.out.println(menu);
		return "ftl/back/MenuEdit";
	}
}
