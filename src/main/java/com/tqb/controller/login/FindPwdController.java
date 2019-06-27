package com.tqb.controller.login;

import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.Session;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.qcloudsms.SmsSingleSender;
import com.github.qcloudsms.SmsSingleSenderResult;
import com.github.qcloudsms.httpclient.HTTPException;
import com.tqb.interfaces.login.LoginService;
import com.tqb.pojo.result.QuesResult;

import cn.itcast.mail.Mail;
import cn.itcast.mail.MailUtils;

/**
 * 
 * <p>Title: FindPwdController.java</p>
 * <p>Description: 
 * 密码找回控制层
 * <p>
 * @author tianqb
 * @mail tqb820965236@163.com
 * @date 2019年6月26日下午2:46:43
 * @version 1.0
 *
 */
@Controller
public class FindPwdController {
	
	@Autowired
	private LoginService service;
	private String checkCode;
	
	@Value("${host}")
	private String host;
	@Value("${uname}")
	private String uname;
	@Value("${pwd}")
	private String pwd;
	@Value("${from}")
	private String from;
	@Value("${subject}")
	private String subject;
	@Value("${AppID}")
	private String appid;
	@Value("${AppKey}")
	private String appkey;
	@Value("${templateId}")
	private String templateId;
	
	public boolean findByPhone(String phone){
		return service.findByPhone(phone);
	}
	
	public boolean findByMail(String mail){
		return service.findByMail(mail);
	}
	
	// 判断密码是否一致
	public boolean isYiZhi(String password, String repass){
		return password.equals(repass);
	}
	
	@ResponseBody
	@RequestMapping("/ques/findPasswd")
	public QuesResult find(String phone, String wid, String email, String password, String repass){
		QuesResult qr = new QuesResult();
		if (phone != null){// 通过手机号修改密码
			if (findByPhone(phone)){// 如果手机存在，进行修改处理
				// 进行验证码的操作
				if (wid.equals(checkCode)){
					service.updatePwd("phone", phone, password);
				}else{
					// 回显操作
					// 返回到找回页面
					qr.setMsg("error");
					return qr;
				}
			}else{
				// 回显操作
				// 返回到找回页面
				qr.setMsg("error");
				return qr;
			}
		}else{// 通过邮箱修改密码
			if (email != null){// 
				if (wid.equals(checkCode)){
					service.updatePwd("mail", email, password);
				}else{
					// 回显操作
					// 返回到找回页面
					qr.setMsg("error");
					return qr;
				}
			}else{
				// 回显操作
				// 返回到找回页面
				qr.setMsg("error");
				return qr;
			}
		}
		qr.setMsg("success");
		return qr;
		
	}
	
	@ResponseBody
	@RequestMapping("/ques/sendMsg")
	public void send(String email, String phone){
		if (phone != null){
			// 生成验证码 6位
			checkCode = buildCheckCode(6);
			sendByPhone(checkCode,phone);
		}else{
			// 生成验证码
			checkCode = buildCheckCode(6);
			sendByMail(checkCode,email);
		}
	}
	
	public void sendByPhone(String checkCode, String msg){
		try {
			String[] params = {checkCode, "1" };
			SmsSingleSender ssender = new SmsSingleSender(Integer.valueOf(appid), appkey);
			SmsSingleSenderResult result = ssender.sendWithParam("86", msg, Integer.valueOf(templateId), params, "", "",
					""); // 签名参数未提供或者为空时，会使用默认签名发送短信
			System.out.print(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void sendByMail(String checkCode, String msg){
		try {
			Session session = MailUtils.createSession(host, uname, pwd);
			
			String to = msg;
			String message = "您现在正在找回密码，验证码为" + checkCode+"，切勿告诉他人，以防账号泄露！";
			Mail mail = new Mail(from, to, subject, message);
			MailUtils.send(session, mail);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}
	
	public String buildCheckCode(int length){
		String[] codes = new String[]{"1","2","3","4","5","6","7","8","9","0"};
		String code = "";
		for (int i = 0; i < length; i++) {
			int r = (int)(Math.random() * 10);
			code += codes[r];
		}
		System.out.println(code);
		return code;
	}
	
	/*@Test
	public void codetest(){
		System.out.println(buildCheckCode(6));
	}*/
}
