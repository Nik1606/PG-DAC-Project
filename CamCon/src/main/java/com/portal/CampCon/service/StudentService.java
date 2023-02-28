package com.portal.CampCon.service;

import com.portal.CampCon.model.Student;

import java.util.List;

public interface StudentService {

    public Student saveStudent(Student student);

    public List<Student> getAllStudents();
}
