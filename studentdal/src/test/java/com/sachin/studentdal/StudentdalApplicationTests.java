package com.sachin.studentdal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sachin.studentdal.entities.Student;
import com.sachin.studentdal.repos.StudentRepository;

@SpringBootTest
class StudentdalApplicationTests {
	
	@Autowired
	private StudentRepository studentRepository;

	@Test
	public void testCreateStudent()
	{
		Student student = new Student();
		student.setId(122);
		student.setName("Johny");
		student.setCourse("AWS webservices");
		student.setFee(60d);
		studentRepository.save(student);
	}
}
