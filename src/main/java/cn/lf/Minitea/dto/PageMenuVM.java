package cn.lf.Minitea.dto;

import java.util.List;

import cn.lf.Minitea.po.Menu;

public class PageMenuVM extends Menu{

	private List<Menu> menus;

	public List<Menu> getMenus() {
		return menus;
	}

	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}

	@Override
	public String toString() {
		return "PageMenuVM [menus=" + menus + ", getId()=" + getId() + ", getPid()=" + getPid() + ", getValue()="
				+ getValue() + ", getUrl()=" + getUrl() + ", getStatus()=" + getStatus() + ", getImageUrl()="
				+ getImageUrl() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	
}
