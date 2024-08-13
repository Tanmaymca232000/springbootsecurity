package com.user.registration.controller;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/api")
@RestController
public class HomeController {
  
	@GetMapping("/index")
	public String index()
	{
		return "Index Page";
	}
	@GetMapping("/home")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public String home()
	{
		return " Home page";
	}
	@GetMapping("/about")
	@PreAuthorize("hasAuthority('ROLE_USER')")
	public String about()
	{
		return "About Page";
	}
}
