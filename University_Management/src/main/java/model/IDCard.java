package model;

import javax.persistence.*;

@Entity
@Table(name="idcard")
public class IDCard {

    @Id
    @GeneratedValue
    private int id;

    private String cardNumber;

    @OneToOne
    @JoinColumn(name="student_id")
    private Student student;

    public IDCard(){}
}