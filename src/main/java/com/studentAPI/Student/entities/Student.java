package com.studentAPI.Student.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="students")
public class Student {
    @Id
    private long id;

    @Column(name="f_name",nullable = false)
    private String fname;

    @Column(name="l_name",nullable = false)
    private String lname;
    private  String branch;
    private String city;
    private String course;

}
