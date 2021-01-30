package com.srini.spring.mockito.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.srini.spring.mockito.api.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
