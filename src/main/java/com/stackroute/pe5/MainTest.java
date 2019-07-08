package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainTest {

    public List<Student> DataOfStudent() {
        Student obj1 = new Student(2, "rohit", 11);
        Student obj2 = new Student(3, "samarth", 22);
        Student obj3 = new Student(1, "rajesh", 20);
        Student obj4 = new Student(5, "rohit", 25);
        Student obj5 = new Student(4, "rohit", 22);
        List<Student> list = new ArrayList<Student>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        list.add(obj4);
        list.add(obj5);

        Collections.sort(list, new StudentSorter());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getId() + " " + list.get(i).getNameofstudent() + " " + list.get(i).getAgeofstudent());
        }
        return list;
    }
}