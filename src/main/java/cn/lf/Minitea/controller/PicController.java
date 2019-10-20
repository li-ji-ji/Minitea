package cn.lf.Minitea.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.lf.Minitea.po.MiniteaPic;
import cn.lf.Minitea.service.MiniteaPicService;

@Controller
@RequestMapping("/pic")
public class PicController {
	
	@Autowired
	private MiniteaPicService picService;
	
	@RequestMapping("/toTable")
	public String toTable(Model model) throws Exception{
		List<MiniteaPic> picList = picService.getAll();
		model.addAttribute("picList",picList);
		return "pic/Table";
	}
	
	
	@RequestMapping("/toAdd")
	public String toAdd(Model model)throws Exception{
		MiniteaPic pic2 = picService.getById(5);
		System.out.println("===================");
		System.out.println(pic2.getId());
		System.out.println("===================");
		model.addAttribute("pic", pic2);
		return "pic/AddForm";
	}
	
	@RequestMapping("/add")
	public String add(MiniteaPic pic) throws Exception{
		picService.add(pic);
		return "redirect:toTable";
	}
	

	
	@RequestMapping("/toEdit")
	public String toEdit(@RequestParam("id")Integer id,Model model)throws Exception{
		MiniteaPic pic = picService.getById(id);
		model.addAttribute("pic", pic);
		return "pic/EditForm";
	}
	
	@RequestMapping("/edit")
	public String edit(MiniteaPic pic) throws Exception{
		picService.update(pic);
		return "redirect:toTable";
	}
	
	@RequestMapping("/delete")
	public String delete(Integer id )throws Exception{
		picService.delete(id);
		return "redirect:toTable";
	}
}
