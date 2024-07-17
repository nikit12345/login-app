package com.example.LoginApp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.LoginApp.dto.StudentDTO;
import com.example.LoginApp.dto.StudentSaveDTO;
import com.example.LoginApp.entity.Student;
import com.example.LoginApp.service.StudentService;
import com.example.LoginApp.service.StudentServiceImpl;

import jakarta.websocket.server.PathParam;

@RestController
@CrossOrigin
@RequestMapping("api")

public class StudentController {
	
	@Autowired
	private StudentService studentService;
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/saveStudent")
	public ResponseEntity<String> saveStudent(@RequestBody StudentSaveDTO studentSaveDTO) {
		
		studentService.saveStudents(studentSaveDTO);
		return new ResponseEntity<>("students Data saved sucessfully",HttpStatus.CREATED);
		
	}
	
	@GetMapping("/getStudent/{id}")
	public Optional<Student> getStudentsById(@PathVariable Long id) {
		
		return studentService.getStudentById(id);
	}
			
	
	@GetMapping("/getAllStd")
	@CrossOrigin(origins = "http://localhost:4200")
	
	public List<StudentDTO> getAllStudents(){
		
		List<StudentDTO> allStudents = studentService.getAllStudents();
		return allStudents;
	}

}
