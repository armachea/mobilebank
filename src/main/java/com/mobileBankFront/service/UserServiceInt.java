package com.mobileBankFront.service;

import com.mobileBankFront.domain.UserInfo;

public interface UserServiceInt {

	void saveInfo(UserInfo userInfo);
	
	UserInfo findByUsername(String username);
	
	UserInfo findByEmail(String email);
	
	boolean checkUsernameExists(String username);
	
	boolean checkEmailExists(String email);
	
	boolean checkUserProfile(String username, String email);
	
	
}
