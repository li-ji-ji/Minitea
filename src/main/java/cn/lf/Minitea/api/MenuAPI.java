package cn.lf.Minitea.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;

import cn.lf.Minitea.dto.AdminMenuVM;
import cn.lf.Minitea.po.MiniteaMenu;
import cn.lf.Minitea.service.MiniteaMenuService;

@RestController
@CrossOrigin
@RequestMapping("/api/menu")
public class MenuAPI {

	@Autowired
	private MiniteaMenuService menuServ;
	
	@RequestMapping("/getAll")
	public List<MiniteaMenu> getAll() throws Exception{
		return menuServ.getAll();
	}
	
	//查询所有菜单并封装
	@RequestMapping("/getMenuVM")
	public List<AdminMenuVM> getMenuVM() throws Exception{
		return menuServ.getMenuVM();
	}
	
	//添加菜单
	@RequestMapping("/add")
	public int add(@RequestBody JSONObject getMenu) throws Exception{
		MiniteaMenu menu = JSONObject.toJavaObject(getMenu, MiniteaMenu.class);
		return menuServ.add(menu);
	}
	
	//修改菜单
	@RequestMapping("/update")
	public int update(@RequestBody JSONObject getMenu) throws Exception{
		MiniteaMenu menu = JSONObject.toJavaObject(getMenu, MiniteaMenu.class);
		return menuServ.update(menu);
	}
	
	//删除菜单
	@RequestMapping("/delete")
	public int delete(@RequestParam("id") Integer id) throws Exception{
		return menuServ.delete(id);
	}
}
