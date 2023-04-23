package com.studentAPI.Student.service;


import com.studentAPI.Student.entities.Student;
import com.studentAPI.Student.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImple implements StudentService {
    @Autowired
private StudentRepository studentRepository;


    public Student saveStudent(Student student) {

        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudent() {
        java.util.List<Student> all = studentRepository.findAll();
        return all;
    }

    @Override
    public Optional<Student> getStudentById(long id) {
        return studentRepository.findById(id);
    }


    @Override
    public Student updateStudent(Student student,long id) {
      return studentRepository.save(student);

    }

    @Override
    public void deleteStudentById(long id) {
        studentRepository.deleteById(id);
    }

}
