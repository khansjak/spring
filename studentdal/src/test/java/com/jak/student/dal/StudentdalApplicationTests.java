package com.jak.student.dal;

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
	public void testCreatStudent() {
		Student student = new Student();
		student.setSname("John Hopkins");
		student.setScourse("Covid 19 Analysis");
		student.setSfee(30d);
		studentRepository.save(student);
		
	}

	@Test
	public void testFindStudentById() {
		Student student = studentRepository.findById(3l).get();
	}
	
	
	@Test
	public void testUpdateStudent() {
		Student student = studentRepository.findById(2l).get();
		student.setSfee(40);
		studentRepository.save(student);
	}
	
	@Test
	public void testDeleteStudent() {
		Student student= studentRepository.findById(1l).get();
		student.setId(1l);
		studentRepository.delete(student);
	}

}
