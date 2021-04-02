package com.neuedu.core.bean;

import lombok.Data;

@Data
public class Person {
    Student student;
    public Person(Student student){
        this.student=student;
    }

    public Student getStudent() {
        return student;
    }
}
