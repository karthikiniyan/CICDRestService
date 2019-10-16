package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MyController {
	
	@RequestMapping("/get/{name}")
	public String get(@PathVariable String name)
	{
		
		System.out.println("inside Altelier Get Method");
		return "Hello World "+name;
	}
	
	
}
