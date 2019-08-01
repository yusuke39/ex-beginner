package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex03")
public class Ex03Controller {
	
	@RequestMapping("")
	public String index() {
		return "ex03";
	}

}
