package com.example.framework.entity;

import java.util.Objects;

public class Student {

    private String name;
    private String age;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return name.equals(student.name) &&
                age.equals(student.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
