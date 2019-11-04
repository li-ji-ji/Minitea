package cn.lf.Minitea.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.lf.Minitea.service.MenuService;
import cn.lf.Minitea.service.MiniteaMenuService;
import cn.lf.Minitea.service.PageconfigService;

@Controller
@RequestMapping("/page")
public class PageController {


	@Autowired
	private PageconfigService confServ;
	@Autowired
	private MenuService menuServ;
	
	@RequestMapping("/index")
	public ModelAndView index(ModelAndView mv) throws Exception{
		mv.setViewName("/static/tea-page");
		mv.addObject("menus",menuServ.getMenuVm());
		mv.addObject("pageConfigs", confServ.getAll());
		return mv;
	}
}
