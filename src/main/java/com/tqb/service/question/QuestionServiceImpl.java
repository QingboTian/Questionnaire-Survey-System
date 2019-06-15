package com.tqb.service.question;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tqb.interfaces.question.QuestionService;
import com.tqb.mapper.ContenMapper;
import com.tqb.mapper.ContentAnswerMapper;
import com.tqb.mapper.QuestionnaireMapper;
import com.tqb.pojo.Conten;
import com.tqb.pojo.ContenExample;
import com.tqb.pojo.ContentAndAnswer;
import com.tqb.pojo.ContentAnswer;
import com.tqb.pojo.ContentAnswerExample;
import com.tqb.pojo.QuesAndContentAndAnswer;
import com.tqb.pojo.Questionnaire;
import com.tqb.pojo.QuestionnaireExample;
import com.tqb.pojo.QuestionnaireExample.Criteria;
import com.tqb.utils.CommonUtils;
import com.tqb.utils.PageBean;

@Service
public class QuestionServiceImpl implements QuestionService {
	@Autowired
	private QuestionnaireMapper mapper;
	@Autowired
	private ContenMapper contentMapper;
	@Autowired
	private ContentAnswerMapper answerMapper;

	@Override
	public PageBean<Questionnaire> list(String uid, int currentPage, int pageSize) {
		// 分页
		PageBean<Questionnaire> pagebean = new PageBean<Questionnaire>();
		// 使用分页工具进行分页
		PageHelper.startPage(currentPage, pageSize);
		QuestionnaireExample example = new QuestionnaireExample();
		Criteria criteria = example.createCriteria();
		criteria.andUIdEqualTo(uid);
		List<Questionnaire> list = mapper.selectByExample(example);
		PageInfo<Questionnaire> pageinfo = new PageInfo<Questionnaire>(list);
		pagebean.setRecordCount((int) pageinfo.getTotal());// 总记录数
		pagebean.setCurrentPage(currentPage);// 当前页
		pagebean.setPageSize(pageinfo.getSize());// 当前页大小
		pagebean.setRecordList(pageinfo.getList());// 每页数据
		pagebean.setPageCount(pageinfo.getPages());// 总页数
		return pagebean;
	}

	/**
	 * 一定要加入主键返回，这里是操作了三张表
	 */
	@Override
	public void add(Questionnaire ques, List<Conten> contentList, List<List<ContentAnswer>> answerList) {
		// 生成uuid
		String qid = CommonUtils.uuid();
		System.out.println(qid);
		ques.setqId(qid);
		// 添加问卷信息
		mapper.insert(ques);
		System.out.println(ques.getqId());
		// 添加问题信息 主键返回
		int count = 0;// 用于判断题目与答案的对应关系
		for (Conten c : contentList) {
			c.setqId(qid);
			contentMapper.insert(c);
			Integer c_id = c.getcId();
			System.out.println("cid :" + c_id);
			List<ContentAnswer> list = answerList.get(count);
			for (ContentAnswer ca : list) {
				ca.setcId(c_id);
				answerMapper.insert(ca);
			}
			count++;
		}
	}

	@Override
	public QuesAndContentAndAnswer papermakeing(String qid) {
		// 自定义的试卷POJO
		QuesAndContentAndAnswer qca = new QuesAndContentAndAnswer();
		// 通过qid查询问卷标题和题目
		qca.setQid(qid);
		Questionnaire questionnaire = mapper.selectByPrimaryKey(qid);
		String qName = questionnaire.getqName();// 试卷标题
		qca.setQuesname(qName);
		ContenExample example = new ContenExample();
		example.createCriteria().andQIdEqualTo(qid);
		List<Conten> contentList = contentMapper.selectByExample(example);
		List<ContentAndAnswer> answerList = new ArrayList<>();
		for (Conten conten : contentList) {
			ContentAnswerExample example1 = new ContentAnswerExample();
			example1.createCriteria().andCIdEqualTo(conten.getcId());
			List<ContentAnswer> answer = answerMapper.selectByExample(example1 );
			ContentAndAnswer ca = new ContentAndAnswer();
			ca.setName(conten.getcTitle());// 问题题目
			ca.setAnswerList(answer);// 问题答案
			answerList.add(ca);
		}
		qca.setAnswerList(answerList);
		return qca;
	}

	@Override
	public void closeOropen(String qid, Boolean state) {
		Questionnaire ques = mapper.selectByPrimaryKey(qid);
		if (state)// 若服务打开则关闭
			ques.setqState(false);
		else// 若服务关闭则打开
			ques.setqState(true);
		mapper.updateByPrimaryKey(ques);
	}

	@Override
	public boolean isOpen(String qid) {
		Questionnaire q = mapper.selectByPrimaryKey(qid);
		return q.getqState();
	}

	@Override
	public String getNameById(String qid) {
		Questionnaire q = mapper.selectByPrimaryKey(qid);
		return q.getqName();
	}

	@Override
	public boolean delete(String qid) {
		/*ContenExample example = new ContenExample();
		example.createCriteria().andQIdEqualTo(qid);
		// 查询问卷是否存在级联信息
		List<Conten> list = contentMapper.selectByExample(example);*/
		int key = mapper.deleteByPrimaryKey(qid);
		if(key == 0)
			return false;
		else
			return true;
	}

}
