package com.tqb.pojo;

import java.util.List;

public class QuesAndContentAndAnswer {
	// 试卷id
	private String qid;
	// 试卷的标题
	private String quesname;
	public String getQid() {
		return qid;
	}

	public void setQid(String qid) {
		this.qid = qid;
	}

	// 试卷题目及答案
	private List<ContentAndAnswer> answerList;

	public String getQuesname() {
		return quesname;
	}

	public void setQuesname(String quesname) {
		this.quesname = quesname;
	}

	public List<ContentAndAnswer> getAnswerList() {
		return answerList;
	}

	public void setAnswerList(List<ContentAndAnswer> answerList) {
		this.answerList = answerList;
	}

}
