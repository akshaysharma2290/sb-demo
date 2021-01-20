package com.example.demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {
	
	@PostMapping
	public String createAccount() {
		System.out.println("Post method");
		return "Account Created";
	}
	
	@GetMapping
	public String getAccount() {
		System.out.println("Get method");
		return "Account Fetched";
	}
	
	@PutMapping
	public String updateAccount() {
		System.out.println("Put method");
		return "Account Updated";
	}
	
	@DeleteMapping
	public String deleteAccount() {
		System.out.println("Delete method");
		return "Account Deleted";
	}
}
