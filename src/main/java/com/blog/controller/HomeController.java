package com.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping(value = "/test")
	public String test(Model model) {
		System.out.println("==========");
		model.addAttribute("name", "zacks");
		return "/index";
	}
}
