package com.youtube.myapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
public class PagesController {
	
	@RequestMapping(value="/hello")
	public String hello(){
		return "indexTwo";
	}

}
