package model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="course")
public class Course {

    @Id
    @GeneratedValue
    private int id;

    private String courseName;
    private int duration;

    @ManyToMany(mappedBy="courses")
    private List<Student> students;

    public Course(){}
}