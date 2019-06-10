package com.tqb.interceptor.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.tqb.pojo.User;

public class LoginInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// 对问卷生成的接口不进行过滤
		String papermaking = "/ques-sys/questionnaire/make";
		String showdata = "/ques-sys/questionnaire/showdata";
		// 提交问卷
		String submit = "/ques-sys/questionnaire/submit";
		// 登录页面
		String login = "/ques-sys/";
		String register = "register";
		String forget = "forget";
		// 登录按钮
		String login_button = "/ques-sys/login";
		
		if (request.getRequestURI().contains(papermaking) || 
				request.getRequestURI().contains(submit) || request.getRequestURI().contains(showdata))
			return true;
		
		// 注册页面
		if (request.getRequestURI().contains(register)){
			return true;
		}
		
		if (request.getRequestURI().contains(forget)){
			return true;
		}
		// 登录页面不需要过滤 直接通过
		if (request.getRequestURI().equals(login)){
			return true;
		}
		// 登录按钮请求的通过
		if (request.getRequestURI().equals(login_button)){
			return true;
		}
		
		// 进行用户状态的判断
		User user = (User) request.getSession().getAttribute("user_state");
		if (user != null){
			// 用户登录
			return true;
		}
		
		// 用户未登录 跳转到登录页面
		request.setAttribute("error", "您当前未登录，请登录后再进行访问！");
		request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
		return false;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {

	}

}
