package com.liurong.test;


import javax.persistence.*;

@Entity
@Table(name="Student")
@Access(AccessType.FIELD)
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name="NAME")
    private String name;

    @Column(name="AGE")
    private int age;
}
