package com.tqb.controller.login;

import java.util.regex.Pattern;

import org.omg.CORBA.UserException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tqb.interfaces.login.LoginService;
import com.tqb.interfaces.login.RegistryService;
import com.tqb.pojo.User;

@Controller
public class RegistryController {
	@Autowired
	private RegistryService registry;
	
	@Autowired
	private LoginService login;
	
	
	@RequestMapping("/regist/register")
	public String registry(User user,Model model){
		if (user == null)
			// 返回注册页面
			return "register";
		// 加入回显操作
		model.addAttribute("user", user);
		// 检验输入数据是否合法
		boolean b = check(user);
		// 检查校验
		if (!b)
			// 返回注册页面
			return "register";
		// 检查用户是否存在
		try {
			User table_user = login.exist(user.getuName().trim());
			if (table_user != null){// 存在该用户，重新注册
				return "register";
			}
		} catch (UserException e) {
		}
		// 进行注册
		registry.register(user);
		return "login";
		
	}
	
	public boolean check(User user){
		// 检查用户名的合法性（不为空，长度大于8小于15）
		if (user.getuName().trim().length() < 8 || user.getuName().trim().length() > 15){
			return false;
		}
		// 检查密码的合法性（不为空，长度大于8小于15，可以加一个弱口令的校验）
		if (user.getuPwd().trim().length() < 8 || user.getuPwd().trim().length() > 15){
			return false;
		}
		// 检查联系方式的合法性（不为空，正则）
		String phone_reg = "^1(?:3\\d|4[4-9]|5[0-35-9]|6[67]|7[013-8]|8\\d|9\\d)\\d{8}$";
		boolean b = Pattern.compile(phone_reg).matcher(user.getuPhone().trim()).matches();
		if (!b)
			return false;
		// 检查邮件的合法性（不为空，正则）
		String mail_reg = "^([A-Za-z0-9_\\-\\.])+\\@([A-Za-z0-9_\\-\\.])+\\.([A-Za-z]{2,4})$";
		boolean b1 = Pattern.compile(mail_reg).matcher(user.getuMail().trim()).matches();
		if (!b1)
			return false;
		
		return true;
	}
	
}