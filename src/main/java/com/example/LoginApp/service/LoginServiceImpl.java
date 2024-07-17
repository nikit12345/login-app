package com.example.LoginApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.LoginApp.entity.LoginPage;
import com.example.LoginApp.repo.LoginRepo;

@Service
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	private LoginRepo loginRepo;

	@Override
	public LoginPage saveLogin(LoginPage loginPage) {
		LoginPage login = loginRepo.save(loginPage);
		return login;
	}

	@Override
	public List<LoginPage> getData() {
		
		return loginRepo.findAll();
	}

}
