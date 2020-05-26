package com.jak.student.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.jak.student.dal.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
