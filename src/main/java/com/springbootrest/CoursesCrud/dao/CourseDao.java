package com.springbootrest.CoursesCrud.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootrest.CoursesCrud.entities.Course;

public interface CourseDao extends JpaRepository<Course, Integer>{
    
}
