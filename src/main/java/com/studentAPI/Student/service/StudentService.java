package com.studentAPI.Student.service;

import com.studentAPI.Student.entities.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    Student saveStudent(Student student);
    List<Student> getAllStudent();
    Optional<Student> getStudentById(long id);
    Student updateStudent(Student student,long id);
    public void deleteStudentById(long id);
}
