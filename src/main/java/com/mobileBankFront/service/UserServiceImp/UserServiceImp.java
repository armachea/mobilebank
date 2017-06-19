package com.mobileBankFront.service.UserServiceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mobileBankFront.dao.UserDaoInt;
import com.mobileBankFront.domain.UserInfo;
import com.mobileBankFront.service.UserServiceInt;

@Service
public class UserServiceImp implements UserServiceInt {

	// link the Data access object for User info interface
	@Autowired
	private UserDaoInt userDaoInt;

	// Commands for saving process in user Info class
	public void saveInfo(UserInfo userInfo) {
		userDaoInt.save(userInfo);
	}

	public UserInfo findByUsername(String username) {

		return userDaoInt.findByUsername(username);

	}

	public UserInfo findByEmail(String email) {

		return userDaoInt.findByEmail(email);

	}

	public boolean checkUsernameExists(String username) {

		if (null != findByUsername(username)) {
			return true;
		}
		return false;
	}

	public boolean checkEmailExists(String email) {

		if (null != findByEmail(email)) {
			return true;
		}
		return false;
	}

	public boolean checkUserProfile(String username, String email) {
		if (checkUsernameExists(username) && checkEmailExists(email)) {
			return true;
		}
		return false;
	}

}
