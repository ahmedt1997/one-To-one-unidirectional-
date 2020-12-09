package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository

public interface Instructor_Repository extends JpaRepository<Instructor, Integer> {

}
