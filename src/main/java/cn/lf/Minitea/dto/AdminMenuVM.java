package cn.lf.Minitea.dto;

import java.util.List;

import cn.lf.Minitea.po.MiniteaMenu;

public class AdminMenuVM extends MiniteaMenu{
	
	private List<MiniteaMenu> menus;
	
	public AdminMenuVM(List<MiniteaMenu> menus) {
		super();
		this.menus = menus;
	}

	public AdminMenuVM() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<MiniteaMenu> getMenus() {
		return menus;
	}

	public void setMenus(List<MiniteaMenu> menus) {
		this.menus = menus;
	}

	@Override
	public String toString() {
		return "AdminMenuVM [menus=" + menus + ", getMenus()=" + getMenus() + ", getId()=" + getId()
				+ ", getMenuName()=" + getMenuName() + ", getMenuUrl()=" + getMenuUrl() + ", getMenuSort()="
				+ getMenuSort() + ", getMenuStatus()=" + getMenuStatus() + ", getMenuImg()=" + getMenuImg()
				+ ", getMenuIntro()=" + getMenuIntro() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}
