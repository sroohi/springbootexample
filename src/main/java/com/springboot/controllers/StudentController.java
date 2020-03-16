package com.springboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.dtos.StudentDto;
import com.springboot.services.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping("/{id}")
	public StudentDto getStudentById(@PathVariable Long id) {
		return studentService.getDummyStudnets(id);

	}

	@PostMapping("/post")

	public @ResponseBody ResponseEntity<String> post() {
		StudentDto dto = new StudentDto();
		System.out.println(dto.toString());
		return new ResponseEntity<String>("POST Response", HttpStatus.OK);

	}

	@PutMapping("/put")
	public @ResponseBody ResponseEntity<String> put() {

		return new ResponseEntity<String>("PUT Response", HttpStatus.OK);
	}

	@DeleteMapping("/delete")
	public @ResponseBody ResponseEntity<String> delete() {

		return new ResponseEntity<String>("DELETE Response", HttpStatus.OK);

	}

	@PatchMapping("/patch")
	public @ResponseBody ResponseEntity<String> patch() {

		return new ResponseEntity<String>("PATCH Response", HttpStatus.OK);
	}

}