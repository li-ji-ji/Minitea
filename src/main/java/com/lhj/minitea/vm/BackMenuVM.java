package com.lhj.minitea.vm;

import java.util.List;

import com.lhj.minitea.po.Backmenu;



public class BackMenuVM extends Backmenu{
	private List<Backmenu> menus;

	public List<Backmenu> getMenus() {
		return menus;
	}

	public void setMenus(List<Backmenu> menus) {
		this.menus = menus;
	}

	@Override
	public String toString() {
		return "MenuVM [menus=" + menus + "]";
	}
	
	
}
