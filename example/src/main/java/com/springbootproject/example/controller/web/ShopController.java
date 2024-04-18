package com.springbootproject.example.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ShopController {
	
	@GetMapping("/shop")
	public ModelAndView homePage() {
		ModelAndView mav = new ModelAndView("web/shop");
		return mav;
	}

}
