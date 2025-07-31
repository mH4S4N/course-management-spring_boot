package com.springbootrest.CoursesCrud.Services;
import java.util.List;

import com.springbootrest.CoursesCrud.entities.Course;


public interface CourseService {
   public List<Course> getCourses();
   public Course getCourse(int id);
   public Course addCourse(Course course);
}
