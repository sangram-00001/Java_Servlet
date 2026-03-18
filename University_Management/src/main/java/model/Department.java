package model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="department")
public class Department {

    @Id
    @GeneratedValue
    private int id;

    private String deptName;

    @OneToMany(mappedBy="department")
    private List<Student> students;

    public Department(){}
}