package com.example.LoginApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.LoginApp.entity.LoginPage;

@Repository
public interface LoginRepo extends JpaRepository<LoginPage, Long>{

}
