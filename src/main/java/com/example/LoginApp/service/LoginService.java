package com.example.LoginApp.service;

import java.util.List;

import com.example.LoginApp.entity.LoginPage;

public interface LoginService {
	
	public LoginPage saveLogin(LoginPage loginPage);
	
	public List<LoginPage> getData();

}
