package com.ashok.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashok.entity.Teacher;

public interface TeacherRepo extends JpaRepository<Teacher,Integer> {
	
	Optional<Teacher>findByUsernameAndPassword(String userName,String password);

}
