package com.example.springbootapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SpringBootAppController {
	
		@GetMapping({"/", "/home"})
	    public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="Rohit") String name) {
	        model.addAttribute("name", name);
	        System.out.println("SpringBootAppController completed !..");
	        return "home";
	    }

}
