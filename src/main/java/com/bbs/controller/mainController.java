package com.bbs.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bbs.service.UsersService;
//import com.bbs.vo.Users;


@Controller
public class mainController {
	
	private static final Logger logger = LoggerFactory.getLogger(mainController.class);
	
	@Inject
	UsersService usersService;
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String main(Model model) throws Exception {
		return "main/main";
	}
	
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String join(Model model) throws Exception {
		return "main/join";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model) throws Exception {
		return "main/login";
	}
	
//	// url 패턴이 'path/joinAction' 일 경우
//		@RequestMapping(value = "/joinAction", method = RequestMethod.POST)
//		public String joinAction(Users users) throws Exception {
//			
//			usersService.joinAction(users);
//			
//			return "redirect:/login";
//			
//		}
}
