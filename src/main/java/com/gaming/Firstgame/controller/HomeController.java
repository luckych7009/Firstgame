package com.gaming.Firstgame.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String print() {
		System.out.println("HEllo World");
		return "home";
		
	}
	
	@GetMapping("/home")
	public String Dashboard() {
		System.out.println("HEllo World");
		return "home";
		
	}
	
}
