package com.srini.spring.mockito.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.srini.spring.mockito.api.dao.StudentRepository;
import com.srini.spring.mockito.api.model.Student;
import com.srini.spring.mockito.api.model.Response;

@RestController
@RequestMapping("/StudentService")
public class StudentController {
	@Autowired
	private StudentRepository repository;

	@PostMapping("/addStudent")
	public Response addEmployee(@RequestBody Student student) {
		repository.save(student);
		return new Response(student.getId() + " inserted", Boolean.TRUE);
	}

	@GetMapping("/getStudents")
	public Response getAllEmployees() {
		List<Student> students = repository.findAll();
		return new Response("record counts : " + students.size(), Boolean.TRUE);
	}
}
