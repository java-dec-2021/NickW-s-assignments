package com.prodcats.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.prodcats.services.TheService;

@Controller
public class HomeController {
	@Autowired
	private TheService tService;
	
	@GetMapping("/products/new")
		public String newProd() {
		return "newProduct.jsp";
	}
	
	@GetMapping("/calegories/new")
	public String newCat() {
	return "newCategory.jsp";
}
}
