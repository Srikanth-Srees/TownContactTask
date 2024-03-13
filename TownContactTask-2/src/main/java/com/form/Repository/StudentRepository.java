package com.form.Repository;

import org.springframework.data.repository.CrudRepository;

import com.form.entity.Student;

public interface StudentRepository extends CrudRepository<Student,Integer>{

}
