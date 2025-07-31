package com.springbootrest.CoursesCrud.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
@Data @Entity
public class Course {
    @Id
    private int id;
    private String title ;
    private String details ;

    
    public Course(){
        super();
    }

    public Course(int id , String title, String details){
        super();
        this.id = id;
        this.title = title;
        this.details = details; 
    }
}
