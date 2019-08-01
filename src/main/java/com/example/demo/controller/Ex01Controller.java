package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex01")
public class Ex01Controller {
	
	@RequestMapping("")
	public String index() {
		return "ex01";
	}
	
	@RequestMapping("/input")
	public String input(String name, Model model) {
		model.addAttribute("name", name);
		return "ex01-result";
	}

}
