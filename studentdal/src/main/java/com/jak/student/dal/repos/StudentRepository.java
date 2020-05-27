package com.jak.student.dal.repos;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.jak.student.dal.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

	Optional<Student> findById(long l);

}
