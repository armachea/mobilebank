package com.mobileBankFront.dao;

import org.springframework.data.repository.CrudRepository;

import com.mobileBankFront.domain.UserInfo;

public interface UserDaoInt extends CrudRepository<UserInfo, Long> {

	UserInfo findByUsername(String username);
	
	UserInfo findByEmail(String email);
}
