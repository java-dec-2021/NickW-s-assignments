package com.dojosurvey.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {
	
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping (path="/welcome", method=RequestMethod.POST)
	public String welcome(@RequestParam("firstName") String fName,
			@RequestParam("email") String email,
			@RequestParam("program") String program, Model dojosurveyModel) {
		
		dojosurveyModel.addAttribute("firstName", fName);
		dojosurveyModel.addAttribute("email", email);
		dojosurveyModel.addAttribute("program", program);
		return "welcome.jsp"; 
	}
	
	
	

}
