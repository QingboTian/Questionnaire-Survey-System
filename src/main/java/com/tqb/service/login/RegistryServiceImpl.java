package com.tqb.service.login;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tqb.interfaces.login.RegistryService;
import com.tqb.mapper.UserMapper;
import com.tqb.pojo.User;
import com.tqb.utils.CommonUtils;

@Service
public class RegistryServiceImpl implements RegistryService {
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public void register(User user) {
		user.setuId(CommonUtils.uuid());
		LocalDateTime date = LocalDateTime.now();
		user.setuDate(date.toString());
		userMapper.insert(user);
	}

}
