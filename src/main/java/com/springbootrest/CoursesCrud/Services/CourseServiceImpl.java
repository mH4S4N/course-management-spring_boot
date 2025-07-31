package com.springbootrest.CoursesCrud.Services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootrest.CoursesCrud.dao.CourseDao;
import com.springbootrest.CoursesCrud.entities.Course;

@Service
public class CourseServiceImpl implements CourseService{
    @Autowired
    private CourseDao courseDao;
    Course course;
    CourseServiceImpl(){
        //courses = new ArrayList<>();
        // courses.add(new Course( 1, "Java", "Basic Java Course"));
        // courses.add(new Course( 2, "Spring", "Complete Spring Course"));
        // courses.add(new Course( 3, "React", "Full React Course"));
    }

    @Override
    public List<Course> getCourses() {
        
       
        return courseDao.findAll();
    }

    @Override
    public Course getCourse(int id) {
        
        courseDao.findById(id);
        return course;
    }

    public Course addCourse(Course course){
        courseDao.save(course);
        return course;
    }

}
