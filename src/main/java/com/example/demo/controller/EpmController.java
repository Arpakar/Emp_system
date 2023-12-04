package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EpmController {
	@GetMapping ("/")
	public String home()
	
	{
	  return "index";
	}
	
	@GetMapping ("/addrent")
    public String addRentFrom()
	
	{
	  return "add_rent";
	}

}
