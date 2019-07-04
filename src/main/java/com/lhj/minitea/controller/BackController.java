package com.lhj.minitea.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.lhj.minitea.po.Backmenu;
import com.lhj.minitea.po.Menu;
import com.lhj.minitea.service.BackMenuService;
import com.lhj.minitea.service.MenuService;
import com.lhj.minitea.service.PageConfigService;
import com.lhj.minitea.utils.ZTreeJSON;
import com.lhj.minitea.vm.BackMenuVM;

@Controller
@RequestMapping("/back")
@CrossOrigin
public class BackController {

	@Autowired
	private BackMenuService backMenuService;
	@Autowired
	private MenuService menuService;
	@Autowired
	private PageConfigService pageConfigService;

	@RequestMapping("/index")
	public String index(Model model) throws Exception {
		List<BackMenuVM> menus = backMenuService.getMenu();
//		System.out.println(menus);
		model.addAttribute("menus", menus);
		return "ftl/back/BackgroundMainPage";
	}
	
	
	
	@RequestMapping("/getMenuUrlById")
	@ResponseBody
	public Backmenu getMenuUrlById(HttpSession session, HttpServletRequest request, HttpServletResponse response,
			Integer id, Model model) throws Exception {
		String getId = request.getParameter("menuid");
		id = Integer.valueOf(getId);

		return backMenuService.getMenuById(id);
	}

	@RequestMapping("/getColumnName")
	public String getColumnName(HttpSession session, HttpServletRequest request, HttpServletResponse response,
			Model model) throws Exception {

		
		  String tableName=request.getParameter("tableName");
		  //System.out.println("获取的表名"+tableName); 
		  List<Map> stringList=backMenuService.getName(tableName);
		  //System.out.println("获取的列名:"+stringList);
		  model.addAttribute("nameList",stringList);
		 
		return null;
	}

	// 跳转到所有菜单表格
	@RequestMapping("/getTable")
	public String getMenuTable(String tableName, Model model, HttpSession session,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		tableName = request.getParameter("tableName");
		List<Map> stringList = backMenuService.getName(tableName);
		//System.out.println("从页面获取的表名" + tableName);
		//System.out.println("获取的列名:" + stringList);
		model.addAttribute("nameList", stringList);
		return "ftl/back/Table";
	}

	// 跳转到菜单添加表单
	@RequestMapping("/getMenuAddFrom")
	public String getMenuAddFrom(String tableName, Model model, HttpSession session,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		tableName = request.getParameter("tableName");
		List<Map> stringList = backMenuService.getName(tableName);
		model.addAttribute("nameList", stringList);
		//System.out.println("从页面获取的表名" + tableName);
		//System.out.println("获取的列名:" + stringList);
		return "ftl/back/MenuFrom";
	}

	// 跳转到菜单编辑表单
	@RequestMapping("/getMenuEditFrom")
	public String getMenuEditFrom(Model model, HttpSession session, HttpServletRequest request,
			HttpServletResponse response, Integer id) throws Exception {

		return "ftl/back/MenuEdit";
	}

	// 跳转到通用所有菜单表格
	@RequestMapping("/toMenuTable")
	public String toMenuTable(String tableName, Model model, HttpSession session, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		tableName = request.getParameter("tableName");
		List<Map> stringList = backMenuService.getName(tableName);
		//System.out.println("获取的列名:" + stringList);
		model.addAttribute("nameList", stringList);
		return "ftl/back/Table";
	}

	// 跳转到通用所有添加表单
	@RequestMapping("/toAllAddFrom")
	public String toAllAddFrom(String tableName, Model model) throws Exception {
		List<Map> stringList = backMenuService.getName(tableName);
		model.addAttribute("nameList", stringList);
//		System.out.println(stringList);
		return "ftl/back/From";
	}

	@RequestMapping("/test")
	@ResponseBody
	public String test(String tableName, Model model) throws Exception {
		List<Backmenu> allMenu=backMenuService.getAllMenu();
		List<ZTreeJSON> zTreeData = new ArrayList();
		for(Backmenu aMenu:allMenu) {
			ZTreeJSON aData=new ZTreeJSON();
			aData.setId(aMenu.getId());
			aData.setPId(aMenu.getpId());
			aData.setName(aMenu.getName());
			zTreeData.add(aData);
		}
		String a=JSON.toJSONString(zTreeData);
		return JSON.toJSONString(zTreeData);
	}
}
