package com.springboot.services;

import org.springframework.stereotype.Service;

import com.springboot.dtos.StudentDto;

@Service
public class StudentService {

	public StudentDto getDummyStudnets(long id) {

		StudentDto s = new StudentDto();
		s.setName("Shawn Roohi");
		s.setPhoneNo("5712698920");
		s.setAddress("8133 Heatherton ln");

		return s;
	}

	public void createStudent() {
		

	}

}
