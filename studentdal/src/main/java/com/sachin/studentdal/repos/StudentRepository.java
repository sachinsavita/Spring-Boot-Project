package com.sachin.studentdal.repos;

import org.springframework.data.repository.CrudRepository;

import com.sachin.studentdal.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
