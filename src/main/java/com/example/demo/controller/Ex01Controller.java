package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex01")

public class Ex01Controller {
	
	@RequestMapping("")
	public String index() {
		return "ex01";
	}

}
