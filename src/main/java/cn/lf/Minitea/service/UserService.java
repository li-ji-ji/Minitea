package cn.lf.Minitea.service;

import org.springframework.stereotype.Service;

import cn.lf.Minitea.po.MiniteaUser;

@Service
public interface UserService extends BaseService<MiniteaUser, Integer>{

	// 根据用户名查询用户信息
	public MiniteaUser getByUsername(String username) throws Exception;
	
	// 用户登录并存入session
	public int checkUser(MiniteaUser user) throws Exception;
	
	// 用户注册激活
	public int setUserEnable(String username,String code) throws Exception;
	
	// 用户注册
	public int userRegister(MiniteaUser user) throws Exception;
	
	//发送激活邮件
	public void sendSimpleMail(MiniteaUser user) throws Exception;
}
