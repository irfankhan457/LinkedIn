package com.abnamro.mulb.constructorreferance;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student {
    private String name;
    private int age;
    public Student() {
    }
    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class demo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Irfan", "Ali", "Ahmed");

        List<Student> students = new ArrayList<>();

        students = names.stream()
                .map(Student::new) // Constructor reference
                .toList();

        System.out.println(students);
    }
}
