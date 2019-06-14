package com.tqb.controller.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.omg.CORBA.UserException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tqb.interfaces.login.LoginService;
import com.tqb.pojo.User;

/**
 * 用户登录控制层
 * @author tqb
 *
 */
@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(String username, String password,Model model, HttpServletRequest request){
		//无论怎样，设置回显
		model.addAttribute("username",username);
		model.addAttribute("password",password);
		// 校验
			//	验证用户是否存在
		User user = null;
		try {
			user = loginService.exist(username);
		} catch (UserException e) {
			// 用户不存在
			model.addAttribute("error", e.getMessage());
			return "login";
		}
		//  验证密码是否正确
		if (!user.getuPwd().trim().equals(password.trim())){
			model.addAttribute("error", "密码错误，请重新输入！");
			return "login";
		}
		// 登录
			//	将用户状态保存至session
		request.getSession().setAttribute("user_state", user);
			//  跳转管理页面
		return "index";
	}
	
	@RequestMapping("/login/exit")
	// 退出登录
	public String exit(HttpSession session){
		// 从session中删除用户状态
		session.removeAttribute("user_state");
		return "login";
	}
	
	// 跳转到注册页面
	@RequestMapping("/register")
	public String toRegisterPage(){
		return "register";
	}
	
	// 跳转到注册页面
	@RequestMapping("/forget")
	public String toForgetPage(){
		return "forget";
	}
}
