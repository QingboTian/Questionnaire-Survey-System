package com.tqb.interfaces.login;

import org.omg.CORBA.UserException;

import com.tqb.pojo.User;

public interface LoginService {

	User exist(String username) throws UserException;

	void updatePwd(String type, String msg, String pwd);

	boolean findByPhone(String phone);

	boolean findByMail(String mail);

}
