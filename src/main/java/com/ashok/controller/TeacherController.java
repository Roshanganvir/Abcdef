package com.ashok.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashok.entity.Teacher;
import com.ashok.service.TeacherService;

@RestController
public class TeacherController {

	@Autowired
	private TeacherService service;

	@PostMapping("/creaated")
	public ResponseEntity<Teacher> created(Teacher teacher) {

		Teacher created = service.created(teacher);
		return new ResponseEntity<>(created, HttpStatus.CREATED);
	}

	@PostMapping("/login")
	public ResponseEntity<Optional> created(String userName, String password) {

		Optional<Teacher> login = service.login(userName, password);
		if (login.isPresent()) {
			login.get().setStatus(true);
			return new ResponseEntity<>(login, HttpStatus.OK);

		} else {
			return new ResponseEntity<>(login, HttpStatus.BAD_REQUEST);
		}
	}

}
