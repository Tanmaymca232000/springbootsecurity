package com.user.registration.controller;


import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HController {
	@GetMapping("/i")
	public String index()
	{
		return "Index Page";
	}
	@GetMapping("/a")
	public String about()
	{
		return "about Page";
	}
	@GetMapping("/p")
	public String profile()
	{
		return "Profile Page";
	}

}
