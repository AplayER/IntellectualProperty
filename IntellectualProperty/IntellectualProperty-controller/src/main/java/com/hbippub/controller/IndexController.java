package com.hbippub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	@RequestMapping("/")
	public String showIndex(){
		return "index";
	}
	@RequestMapping("/login")
	public String showLogin(){
		return "login";
	}

}
