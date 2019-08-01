package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex02")
public class Ex02Controller {
	
	@RequestMapping("")
	public String index() {
		return "ex02";
	}
	
	@RequestMapping("/calc")
	public String calc(int num1, int num2, Model model) {
		int answer = num1 + num2;
		model.addAttribute("answer", answer);
		model.addAttribute("num1", num1);
		model.addAttribute("num2", num2);
		return "ex02-result";
	}

}
