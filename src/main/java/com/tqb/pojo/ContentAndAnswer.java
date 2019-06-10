package com.tqb.pojo;

import java.util.List;

public class ContentAndAnswer {
	private String name;
	private List<ContentAnswer> answerList;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<ContentAnswer> getAnswerList() {
		return answerList;
	}

	public void setAnswerList(List<ContentAnswer> answerList) {
		this.answerList = answerList;
	}

}
