package com.blog.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.blog.entity.User;
import com.blog.service.UserService;

@Controller
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/getUserList")
	public String getUserList(Model model) {
		Map<String, Object> param = new HashMap<String, Object>();
		List<User> userList = userService.getList(param);
		model.addAttribute("userList", userList);
		return "user/showUserList";
	}
}
