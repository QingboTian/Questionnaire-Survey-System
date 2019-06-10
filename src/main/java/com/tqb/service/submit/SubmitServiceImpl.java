package com.tqb.service.submit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tqb.interfaces.submit.SubmitService;
import com.tqb.mapper.SubmitContentMapper;
import com.tqb.mapper.SubmitInfoMapper;
import com.tqb.pojo.SubmitContent;
import com.tqb.pojo.SubmitInfo;

@Service
public class SubmitServiceImpl implements SubmitService {

	@Autowired
	private SubmitInfoMapper siMapper;
	@Autowired
	private SubmitContentMapper scMapper;
	
	@Override
	public void submit(SubmitInfo submitInfo, List<SubmitContent> scList) {
		// 配置主键返回
		siMapper.insert(submitInfo);
		Integer siId = submitInfo.getSiId();
		for (SubmitContent sc : scList) {
			sc.setSiId(siId);
			scMapper.insert(sc);
		}
	}

}
