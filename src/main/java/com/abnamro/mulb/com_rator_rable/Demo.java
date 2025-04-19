package com.abnamro.mulb.com_rator_rable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
class Student {
    int age;
    String name;
}

public class Demo {
    public static void main(String[] args) {
        List<Student> nums = new ArrayList<>();
        nums.add(new Student(20, "John"));
        nums.add(new Student(30, "Jane"));
        nums.add(new Student(25, "Jack"));
        nums.add(new Student(22, "Jill"));
        nums.add(new Student(28, "jonny"));

        Comparator<Student> comparator = (i,j) -> Integer.compare(j.getAge(), i.getAge());
        //StudentComparator comparator = new StudentComparator();
        nums.sort(comparator);
        System.out.println("Sorted List: " + nums);
    }
}

class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
           return o1.getName().compareTo(o2.getName());

    }
}
