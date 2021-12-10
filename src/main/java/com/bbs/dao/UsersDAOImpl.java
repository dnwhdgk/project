package com.bbs.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.bbs.vo.Users;

@Repository
public class UsersDAOImpl implements UsersDAO {

	@Inject
	SqlSession sqlSession;
	
	final String SESSION = "com.bbs.mappers.bbs";
	
	@Override
	public void join(Users users) throws Exception {
		sqlSession.insert(SESSION + ".join",users);		
		
	}

}
