package com.example.demo.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex03")
public class Ex03Controller {
	
	@Autowired
	private ServletContext application;
	
	@RequestMapping("")
	public String index() {
		return "ex03";
	}
	
	@RequestMapping("/calc")
	public String calc(int product1, int product2, int product3) {
		int allPrice = product1 + product2 + product3;
		double includeTax = allPrice * 1.08;
		application.setAttribute("allPrice", allPrice);
		application.setAttribute("includeTax", (int)includeTax);
		return "ex03-result";
	}

}
