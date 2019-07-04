package com.lhj.minitea.vm;

import java.util.List;

import com.lhj.minitea.po.Pageconfig;


public class PageConfigVM extends Pageconfig{
	private List<Pageconfig> pageConfigs;

	public List<Pageconfig> getPageConfigs() {
		return pageConfigs;
	}

	public void setPageConfigs(List<Pageconfig> pageConfigs) {
		this.pageConfigs = pageConfigs;
	}

	@Override
	public String toString() {
		return "PageConfigVM [pageConfigs=" + pageConfigs + "]";
	}

	
	
}
