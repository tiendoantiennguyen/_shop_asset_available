package com.springbootproject.example.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")
public class AdminUtilityAnimationController {
	
	@GetMapping("/utilityAnimation")
	public ModelAndView homePage() {
		ModelAndView mav = new ModelAndView("admin/utilityAnimation");
		return mav;
	}
	
}
