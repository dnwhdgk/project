package com.bbs.service;

import com.bbs.vo.Users;

//service를 구성할 interface 표준 설계 작성
public interface UsersService {

	public void joinAction(Users users) throws Exception;
}
