package com.jak.student.dal;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jak.student.dal.entities.Student;
import com.jak.student.dal.repos.StudentRepository;

@SpringBootTest
class StudentdalApplicationTests {

	@Autowired
	private StudentRepository studentRepository;

	@Test
	public void testCreateStudent() {
		Student student = new Student();
		student.setName("John");
		student.setCourse("Java Full Stack");
		student.setFee(30d);
		studentRepository.save(student);

	}

	@Test
	public void testFindStudentById() {

		Optional<Student> student = studentRepository.findById(1l);
		System.out.println(student);
	}
	
	@Test
	public void testUpdateStudent() {

		Student student = studentRepository.findById(1l).get();
		student.setFee(40d);
		studentRepository.save(student);
		//System.out.println(student);
	}
	
	
	@Test
	public void testDeleteStudent() {

		//Student student = studentRepository.findById(1l).get();
		//student.setFee(40d);
		Student student = new Student();
		student.setId(1l);
		studentRepository.delete(student);
	}
}
