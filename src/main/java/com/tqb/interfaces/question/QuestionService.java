package com.tqb.interfaces.question;

import java.util.List;

import com.tqb.pojo.Conten;
import com.tqb.pojo.ContentAnswer;
import com.tqb.pojo.QuesAndContentAndAnswer;
import com.tqb.pojo.Questionnaire;
import com.tqb.utils.PageBean;

public interface QuestionService {
	public PageBean<Questionnaire> list(String uid, int currentPage, int pageSize);

	public void add(Questionnaire ques, List<Conten> contentList, List<List<ContentAnswer>> answerList);

	public QuesAndContentAndAnswer papermakeing(String qid);

	public void closeOropen(String qid, Boolean state);

	public boolean isOpen(String qid);

	public String getNameById(String qid);

	public boolean delete(String qid);
}
