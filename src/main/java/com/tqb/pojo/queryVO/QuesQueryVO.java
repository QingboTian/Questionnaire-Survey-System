package com.tqb.pojo.queryVO;

import java.util.List;

import com.tqb.pojo.Conten;
import com.tqb.pojo.ContentAnswer;

/**
 * <p>
 * Title: QueryVO.java
 * </p>
 * <p>
 * Description: 提交问卷的POJO类
 * <p>
 * 
 * @author tianqb
 * @mail tqb820965236@163.com
 * @date 2019年6月7日下午2:54:02
 * @version 1.0
 *
 */
public class QuesQueryVO {
	private List<Conten> contentList;
	private List<ContentAnswerList> answerList;

	public List<Conten> getContentList() {
		return contentList;
	}

	public void setContentList(List<Conten> contentList) {
		this.contentList = contentList;
	}

	public List<ContentAnswerList> getAnswerList() {
		return answerList;
	}

	public void setAnswerList(List<ContentAnswerList> answerList) {
		this.answerList = answerList;
	}

}
