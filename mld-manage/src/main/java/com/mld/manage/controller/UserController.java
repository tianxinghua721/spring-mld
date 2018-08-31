package com.mld.manage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mld.manage.pojo.User;
import com.mld.manage.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping("/FindUser")
	public String FindUserList(Model model) {
		List<User> list=userService.FindUserList();
		model.addAttribute("userList",list);
		System.out.println(list);
		return "userList";
	}
}
