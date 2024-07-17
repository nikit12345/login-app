package com.example.LoginApp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.LoginApp.dto.StudentDTO;
import com.example.LoginApp.dto.StudentSaveDTO;
import com.example.LoginApp.entity.Student;
import com.example.LoginApp.repo.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {

	
	@Autowired
	private StudentRepo repo;
	public String saveStudents(StudentSaveDTO studentSaveDTO) {
		Student ss = new Student(
				studentSaveDTO.getsName(),
				studentSaveDTO.getAddress(),
				studentSaveDTO.getMobile(),
				studentSaveDTO.isActive()
				);
		
		repo.save(ss);
		
		
		return 
				"Students data saved sucessfully";
	}
	@Override
	public Optional<Student> getStudentById(Long id) {
		
		return repo.findById(id);
	}
	@Override
	public List<StudentDTO> getAllStudents() {
		
		List<Student> getStudent = repo.findAll();
		List<StudentDTO> stuDtoList = new ArrayList();
		
		for(Student ss : getStudent) {
			StudentDTO studentDTO  = new StudentDTO(ss.getsName(),
					ss.getAddress(),
					ss.getMobile(),
					ss.isActive()
					);
			stuDtoList.add(studentDTO);
		}
		return stuDtoList;
	}

}
