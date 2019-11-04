package cn.lf.Minitea.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.lf.Minitea.dto.AdminMenuVM;
import cn.lf.Minitea.po.MiniteaMenu;
import cn.lf.Minitea.service.MiniteaMenuService;

@Controller
@CrossOrigin
@RequestMapping("/menu")
public class MenuController {

	@Autowired
	private MiniteaMenuService menuService;
	
	@RequestMapping("/toTable")
	public ModelAndView toTable(ModelAndView mav)throws Exception{
		mav.setViewName("/menu/Table");
		List<MiniteaMenu> menus=menuService.getAll();
		mav.addObject("menus", menus);
		return mav;
	}
	
	@RequestMapping("/toAdd")
	public ModelAndView toAdd(ModelAndView mav,Integer id)throws Exception{
		mav.setViewName("/menu/AddForm");
		return mav;
	}
	
	@RequestMapping("/add")
	public ModelAndView add(ModelAndView mav,MiniteaMenu menu) throws Exception{
		menuService.add(menu);
		return new ModelAndView("redirect:/menu/toTable");
	}
	
	@RequestMapping("/toEdit")
	public ModelAndView toEdit(ModelAndView mav,Integer id)throws Exception{
		mav.setViewName("/menu/EditForm");
		MiniteaMenu menu=menuService.getById(id);
		mav.addObject("menu", menu);
		return mav;
	}
	
	@RequestMapping("/edit")
	public ModelAndView edit(ModelAndView mav,MiniteaMenu menu) throws Exception{
		menuService.update(menu);
		return new ModelAndView("redirect:/menu/toTable");
	}
	
	@RequestMapping("/delete")
	public ModelAndView delete(ModelAndView mav,Integer id) throws Exception{
		menuService.delete(id);
		return new ModelAndView("redirect:/menu/toTable");
	}
	
	//查询所有菜单并封装
	@RequestMapping("/getMenuVM")
	@ResponseBody
	public List<AdminMenuVM> getMenuVM() throws Exception{
		return menuService.getMenuVM();
	}
}
