package cn.lf.Minitea.controller;

import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import cn.lf.Minitea.po.MiniteaUser;
import cn.lf.Minitea.service.UserService;
import cn.lf.Minitea.utils.ResultMsg;

@Controller
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private JavaMailSender mailSender;
	
	@Autowired
	private UserService userServ;
	
	// 跳转到用户登录页面
	@RequestMapping("/toLogin")
	public String toLogin()throws Exception{
		return "login/login";
	}
	
	// 用户登录
	@RequestMapping("/login")
	@ResponseBody
	public int login(@RequestBody JSONObject getUser,HttpServletRequest request,HttpServletResponse response) throws Exception{
		System.out.println(getUser.toJSONString());
        HttpSession session = request.getSession();
		MiniteaUser user = JSON.toJavaObject(getUser, MiniteaUser.class);
        if(userServ.checkUser(user)==1) {
        	session.setAttribute("UserInfo", user);
        }
		return userServ.checkUser(user);
	}
	
	//用户注册
	@RequestMapping("/register")
	@ResponseBody
	public ResultMsg userRegister(@RequestBody JSONObject getUser) throws Exception{
		System.out.println(getUser.toJSONString());
		ResultMsg msg=new ResultMsg();
		MiniteaUser user = JSON.toJavaObject(getUser, MiniteaUser.class);
		try {
			userServ.userRegister(user);
			msg.setCode(1);
		} catch (Exception e) {
			e.printStackTrace();
			msg.setCode(0);
		}
		
		return msg;
	}
	
	//用户激活
	@RequestMapping("/codeCheck")
	public String userRegister(@RequestParam("username") String username,@RequestParam("code") String code) throws Exception{
		userServ.setUserEnable(username, code);
		return "redirect:toLogin";
	}
	
}
