package cn.lf.Minitea.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import cn.lf.Minitea.mapper.extend.UserMapperExtends;
import cn.lf.Minitea.po.MiniteaUser;
import cn.lf.Minitea.po.MiniteaUserExample;
import cn.lf.Minitea.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private JavaMailSender mailSender;
	@Autowired
	private UserMapperExtends userMapper;
	
	@Override
	public List<MiniteaUser> getAll() throws Exception {
		return userMapper.selectByExample(null);
	}

	@Override
	public int add(MiniteaUser user) throws Exception {
		List<MiniteaUser>  getUser= new ArrayList<MiniteaUser>();
		MiniteaUserExample example = new MiniteaUserExample();
		MiniteaUserExample.Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(user.getUsername());
		getUser=userMapper.selectByExample(example);
		if(getUser.size()>0) {
			return 0;
		}else {
			user.setCode(UUID.randomUUID().toString().replace("-", "").toLowerCase());
			userMapper.insertSelective(user);
			return 1;
		}
	}

	@Override
	public int update(MiniteaUser user) throws Exception {
		return userMapper.updateByPrimaryKeySelective(user);
	}

	@Override
	public int delete(Integer id) throws Exception {
		return userMapper.deleteByPrimaryKey(id);
	}

	// 根据用户账号查询用户信息
	@Override
	public MiniteaUser getByUsername(String username) throws Exception {
		List<MiniteaUser>  getUser= new ArrayList<MiniteaUser>();
		MiniteaUserExample example = new MiniteaUserExample();
		MiniteaUserExample.Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(username);
		getUser=userMapper.selectByExample(example);
		if(getUser.size()>0) {
			return getUser.get(0);
		}else {
			return null;
		}
	}


	
	// 用户登录并存入session
	@Override
	public int checkUser(MiniteaUser user) throws Exception{
		MiniteaUser getUser = getByUsername(user.getUsername());
		if(getUser.getPassword().equals(user.getPassword())) {
			return 1;
		}else {
			return 0;
		}
	}
	
	// 用户注册
	@Override
	public int userRegister(MiniteaUser user) throws Exception{
		try {
			add(user);
			MiniteaUser getUser = getByUsername(user.getUsername());
			sendSimpleMail(getUser);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}


	// 发送激活邮件
	@Override
	public void sendSimpleMail(MiniteaUser user) throws Exception {
		MimeMessage mimeMessage = mailSender.createMimeMessage();
		MimeMessageHelper message = new MimeMessageHelper(mimeMessage, true);
		message.setFrom("1187382451@qq.com");
		message.setTo(user.getMail());
		message.setSubject("激活验证");
		message.setText("<html><body><a href='http://localhost:8080/login/codeCheck?username="+user.getUsername()+"&code="+user.getCode()+"'>请点击此处激活账户</a></body></html>",true);

		mailSender.send(mimeMessage);
	}
	
	// 用户注册激活
	@Override
	public int setUserEnable(String username,String code) throws Exception{
		MiniteaUser user=getByUsername(username);
		if(user.getCode().equals(code)) {
			user.setEnable(1);
			return update(user);
		}else {
			return 0;
		}
	}

}
