package com.tqb.interfaces.submit;

import java.util.List;

import com.tqb.pojo.SubmitContent;
import com.tqb.pojo.SubmitInfo;

public interface SubmitService {

	void submit(SubmitInfo submitInfo, List<SubmitContent> scList);

}
