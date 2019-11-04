package cn.lf.Minitea.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.lf.Minitea.po.MiniteaUser;
import cn.lf.Minitea.service.MiniteaMenuService;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private MiniteaMenuService menuService;
	
	@RequestMapping("/index")
	public ModelAndView index(ModelAndView mv,HttpServletRequest request) throws Exception{
		mv.setViewName("/admin/AdminPage");
		HttpSession session = request.getSession();
		mv.addObject("UserInfo", session.getAttribute("UserInfo"));
		mv.addObject("MenuVM",menuService.getMenuVM());
		return mv;
	}
	
}
