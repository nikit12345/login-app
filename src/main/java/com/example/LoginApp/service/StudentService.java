package com.example.LoginApp.service;

import java.util.List;
import java.util.Optional;

import com.example.LoginApp.dto.StudentDTO;
import com.example.LoginApp.dto.StudentSaveDTO;
import com.example.LoginApp.entity.Student;

public interface StudentService {

	String saveStudents(StudentSaveDTO studentSaveDTO);
	
	Optional<Student> getStudentById(Long id);
	
	List<StudentDTO> getAllStudents();

}
