package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	@RequestMapping("/")
	public String main() {
		return "/index.jsp";
	}
	
	@RequestMapping("/2")
	public String main2() {
		return "/index.jsp";
	}
}
