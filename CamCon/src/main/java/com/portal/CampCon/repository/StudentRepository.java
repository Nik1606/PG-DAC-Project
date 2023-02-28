package com.portal.CampCon.repository;

import com.portal.CampCon.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
