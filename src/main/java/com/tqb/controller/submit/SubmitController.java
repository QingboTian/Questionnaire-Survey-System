package com.tqb.controller.submit;

import java.time.LocalDateTime;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tqb.interfaces.submit.SubmitService;
import com.tqb.pojo.SubmitContent;
import com.tqb.pojo.SubmitInfo;
import com.tqb.pojo.ip.IP;
import com.tqb.utils.JsonUtils;

@Controller
public class SubmitController {
	@Autowired
	private SubmitService submitService;
	
	// 调用ip的API
	//@Value("${IP_API}")
	private String url = "http://ip.taobao.com/service/getIpInfo.php?ip=";

	/**
	 * 问卷提交
	 * 应该返回一个页面，内容为感谢填写，再有一个首页的链接
	 * @param request
	 */
	@RequestMapping("/questionnaire/submit")
	public String submit(HttpServletRequest request, SubmitInfo submitInfo, List<SubmitContent> scList) {
		// 用户ip
		String remoteAddr = request.getRemoteAddr();
		// 调用api判断ip地址 陕西西安
		String local = getLocalByIP(remoteAddr);
		submitInfo.setqId((String)request.getAttribute("qid"));
		submitInfo.setSiIp(remoteAddr);
		submitInfo.setSiLocation(local);
		submitInfo.setSiDate(LocalDateTime.now().toString());
		submitService.submit(submitInfo,scList);
		return "success";
	}

	// 通过ip判断用户地址
	public String getLocalByIP(String ip) {
		@SuppressWarnings({ "resource", "deprecation" })
		HttpClient http = new DefaultHttpClient();
		HttpGet request = new HttpGet(url + ip);
		HttpResponse response = null;
		try {
			response = http.execute(request);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		String text = null;
		try {
			text = EntityUtils.toString(response.getEntity(), "utf-8");
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 通过返回的json数据转化为实体
		String local = getlocal(text);
		return local;
	}

	public String getlocal(String text) {
		IP ip = JsonUtils.jsonToPojo(text, IP.class);
		return ip.getData().getRegion() + ip.getData().getCity();
	}
}
