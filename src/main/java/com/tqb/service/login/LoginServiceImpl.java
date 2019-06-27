package com.tqb.service.login;

import java.util.List;

import org.omg.CORBA.UserException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tqb.interfaces.login.LoginService;
import com.tqb.mapper.UserMapper;
import com.tqb.pojo.User;
import com.tqb.pojo.UserExample;
import com.tqb.pojo.UserExample.Criteria;

@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	private UserMapper user;

	@Override
	public User exist(String username) throws UserException {
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUNameEqualTo(username);
		List<User> list = user.selectByExample(example);
		// 用户不存在
		if (list.size() == 0) {
			throw new UserException("用户不存在,请重新输入！") {
			};
		}
		return list.get(0);
	}

	@Override
	public void updatePwd(String type, String msg, String pwd) {
		if (type.equals("phone")){
			UserExample example = new UserExample();
			example.createCriteria().andUPhoneEqualTo(msg);
			List<User> userlist = user.selectByExample(example);
			User u = userlist.get(0);
			u.setuPwd(pwd);
			user.updateByExample(u, example);
		}else{
			UserExample example = new UserExample();
			example.createCriteria().andUMailEqualTo(msg);
			List<User> userlist = user.selectByExample(example);
			User u = userlist.get(0);
			u.setuPwd(pwd);
			user.updateByExample(u, example);
		}
	}

	@Override
	public boolean findByPhone(String phone) {
		UserExample example = new UserExample();
		example.createCriteria().andUPhoneEqualTo(phone);
		List<User> userlist = user.selectByExample(example);
		if (userlist.size() == 0)
			return false;
		return true;
	}

	@Override
	public boolean findByMail(String mail) {
		UserExample example = new UserExample();
		example.createCriteria().andUMailEqualTo(mail);
		List<User> userlist = user.selectByExample(example);
		if (userlist.size() == 0)
			return false;
		return true;
	}
}
