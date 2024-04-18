package com.springbootproject.example.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CheckoutController {
	
	@GetMapping("/checkout")
	public ModelAndView homePage() {
		ModelAndView mav = new ModelAndView("web/checkout");
		return mav;
	}
	
}
