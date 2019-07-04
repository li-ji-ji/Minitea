package com.lhj.minitea.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lhj.minitea.po.Backmenu;
import com.lhj.minitea.service.BackMenuService;

@RestController
@RequestMapping("/api/backmenu")
@CrossOrigin
public class BackMenuAPI {
	@Autowired
	private BackMenuService backMenuService;
	@RequestMapping("/getAll")
	public List<Backmenu> test(String tableName, Model model) throws Exception {
		List<Backmenu> allMenu=backMenuService.getAllMenu();
		return allMenu;
	}
}
