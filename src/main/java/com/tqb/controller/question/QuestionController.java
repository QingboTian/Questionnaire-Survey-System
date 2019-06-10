package com.tqb.controller.question;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tqb.interfaces.question.QuestionService;
import com.tqb.pojo.Conten;
import com.tqb.pojo.ContentAnswer;
import com.tqb.pojo.QuesAndContentAndAnswer;
import com.tqb.pojo.Questionnaire;
import com.tqb.pojo.User;
import com.tqb.utils.PageBean;

// 问卷的控制层
@Controller
public class QuestionController {
	
	// 页大小
	//@Value("${PAGE_SIZE}")
	private Integer PAGE_SIZE = 10;

	@Autowired
	private QuestionService service;

	@ResponseBody
	@RequestMapping("/ques/list")
	// 查询问卷列表
	public PageBean<Questionnaire> list(String uid, Integer currentPage, HttpServletResponse response) {
		if (currentPage == null)
			currentPage = 1;
		PageBean<Questionnaire> list = service.list(uid, currentPage, PAGE_SIZE);
		return list;
	}

	// 跳转至创建问卷的页面（用户创建）
	@RequestMapping("/ques/toAddPage")
	public String toAddPage() {
		return "createque";
	}

	// 创建问卷（真正要答题的那个呀）
	public String add(HttpServletRequest request, HttpSession session, Questionnaire ques, List<Conten> contentList,
			List<List<ContentAnswer>> answerList) {
		User user = (User) session.getAttribute("user_state");
		// 获得用户id
		String uid = user.getuId();
		ques.setuId(uid);
		// 生成创建时间
		LocalDateTime date = LocalDateTime.now();
		ques.setqCreatedate(date.toString());
		// 状态默认为true
		ques.setqState(true);
		// 提交数据
		service.add(ques, contentList, answerList);
		// 添加数据成功后，跳转到首页
		// 记得带参数 uid 当前页（非必须）
		request.setAttribute("currentPage", 1);
		request.setAttribute("uid", uid);
		return "index";
	}

	

	/**
	 * 生成问卷的接口 这个接口不应该过滤 在过滤器中进行释放
	 * 应该进行服务开与闭的判断
	 * @param qid
	 *            试卷id
	 */
	@ResponseBody
	@RequestMapping("/questionnaire/make")
	public QuesAndContentAndAnswer testpapermaking(String qid) {
		// 查看服务的开与闭
		boolean b = service.isOpen(qid);
		if(b) {
			QuesAndContentAndAnswer qca = service.papermakeing(qid);
			return qca;
		}
		return null;
	}
	
	// 关闭服务
	public String closeOropen(String qid, Boolean state){
		service.closeOropen(qid, state);
		return "index";
	}

	// 测试方法
	@RequestMapping("/ques/testtest")
	public void test(HttpServletRequest request, HttpSession session) {
		Questionnaire q = new Questionnaire();
		q.setqName("测试1");
		q.setqCount(300);
		q.setqRemark("beizhu test1");
		q.setqTime(100);

		List<Conten> contentList = new ArrayList<>();
		Conten c1 = new Conten();
		c1.setcTitle("question1");
		Conten c2 = new Conten();
		c2.setcTitle("question2");
		Conten c3 = new Conten();
		c3.setcTitle("question3");
		contentList.add(c1);
		contentList.add(c2);
		contentList.add(c3);

		List<List<ContentAnswer>> answerList = new ArrayList<>();
		List<ContentAnswer> list1 = new ArrayList<>();
		List<ContentAnswer> list2 = new ArrayList<>();
		List<ContentAnswer> list3 = new ArrayList<>();
		ContentAnswer ca1 = new ContentAnswer();
		ca1.setCaAnswer("答案1-1");
		ContentAnswer ca2 = new ContentAnswer();
		ca2.setCaAnswer("答案1-2");
		ContentAnswer ca3 = new ContentAnswer();
		ca3.setCaAnswer("答案1-3");
		list1.add(ca1);
		list1.add(ca2);
		list1.add(ca3);
		ContentAnswer ca21 = new ContentAnswer();
		ca21.setCaAnswer("答案2-1");
		ContentAnswer ca22 = new ContentAnswer();
		ca22.setCaAnswer("答案2-2");
		ContentAnswer ca23 = new ContentAnswer();
		ca23.setCaAnswer("答案2-3");
		list2.add(ca21);
		list2.add(ca22);
		list2.add(ca23);
		ContentAnswer ca31 = new ContentAnswer();
		ca31.setCaAnswer("答案3-1");
		ContentAnswer ca32 = new ContentAnswer();
		ca32.setCaAnswer("答案3-2");
		ContentAnswer ca33 = new ContentAnswer();
		ca33.setCaAnswer("答案3-3");
		list3.add(ca31);
		list3.add(ca32);
		list3.add(ca33);
		answerList.add(list1);
		answerList.add(list2);
		answerList.add(list3);
		add(request, session, q, contentList, answerList);
		System.out.println("ok");
	}
}
