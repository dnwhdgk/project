package com.bbs.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.bbs.dao.UsersDAO;
import com.bbs.vo.Users;

@Service
public class UsersServiceImpl implements UsersService {

	@Inject
	UsersDAO dao;
	
	@Override
	public void joinAction(Users users) throws Exception {
		dao.join(users);
		
	}

}
