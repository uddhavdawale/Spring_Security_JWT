package com.ud.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class home
{
	@RequestMapping("/welcome")
	public String welcome()
	{
		return " this page is private ";
	}
}
