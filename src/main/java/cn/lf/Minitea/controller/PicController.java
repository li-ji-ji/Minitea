package cn.lf.Minitea.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.lf.Minitea.po.MiniteaPic;
import cn.lf.Minitea.service.MiniteaPicService;

@Controller
@RequestMapping("/pic")
public class PicController {

	@Autowired
	private MiniteaPicService picService;
	
	@RequestMapping("/getAll")
	@ResponseBody
	public List<MiniteaPic> getAll() throws Exception{
		return picService.getAll();
	}
	
	@RequestMapping("/getById")
	@ResponseBody
	public MiniteaPic getById(@RequestParam("id")Integer id) throws Exception{
		System.out.println(id);
		return picService.getById(id);
	}
	
	
	
}
