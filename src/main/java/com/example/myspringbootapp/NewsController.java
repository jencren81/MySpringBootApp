package com.example.myspringbootapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/news")
public class NewsController {
	
	@GetMapping("/headline")
	@ResponseBody
	public String getLatestBusinessNewsHeadline() {
		return "Juiced fall e-bike sale up to $900 off, Greenworks electric pressure washer, more";
		
	}
	

}
