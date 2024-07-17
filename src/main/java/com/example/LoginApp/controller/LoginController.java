package com.example.LoginApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.LoginApp.entity.LoginPage;
import com.example.LoginApp.service.LoginService;

@RestController
@RequestMapping
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@PostMapping("/saveLogin")
    @CrossOrigin(origins = "http://localhost:4200")

	public ResponseEntity<LoginPage> saveLOgin(@RequestBody LoginPage loginPage){
		LoginPage l = loginService.saveLogin(loginPage);
		return new ResponseEntity<LoginPage>(l, HttpStatus.CREATED);
	}
	
	@GetMapping("/get")
	public String get() {
		return "hii";
	}
	
    @CrossOrigin(origins = "http://localhost:4200")

	@GetMapping("/getData")
	public List<LoginPage> getData(){
		return loginService.getData();
	}

}
