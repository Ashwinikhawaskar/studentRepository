package com.studentAPI.Student.repositories;

import com.studentAPI.Student.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
