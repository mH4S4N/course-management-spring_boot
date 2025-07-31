package com.springbootrest.CoursesCrud.Controllers;

import java.util.List;

import com.springbootrest.CoursesCrud.Services.CourseService;
import com.springbootrest.CoursesCrud.entities.Course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllers {
    @Autowired
    private CourseService courseService;

    @GetMapping("/courses")
    public List<Course> getCourses(){
       return this.courseService.getCourses();
    }

    @GetMapping("/courses/{id}")
    public Course getCourse(@PathVariable String id){
        return this.courseService.getCourse(Integer.parseInt(id));
    }

    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course){
        return  this.courseService.addCourse(course);
    }


}
