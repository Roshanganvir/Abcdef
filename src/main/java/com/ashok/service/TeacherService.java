package com.ashok.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashok.entity.Teacher;
import com.ashok.repo.TeacherRepo;

@Service
public class TeacherService {

	@Autowired
	private TeacherRepo repo;

	public Teacher created(Teacher teacher) {

		return repo.save(teacher);
	}

	public Optional<Teacher> login(String userName, String password) {

		return repo.findByUsernameAndPassword(userName, password);
	}

}
