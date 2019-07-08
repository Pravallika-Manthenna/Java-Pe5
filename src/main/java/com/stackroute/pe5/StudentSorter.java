package com.stackroute.pe5;

import java.util.Comparator;

public class StudentSorter implements Comparator<Student> {
    public int compare(Student student1,Student student2) {
        if(student1.getAgeofstudent()>student2.getAgeofstudent())
        {
            return student1.getAgeofstudent()-student2.getAgeofstudent();
        }
        else if(student1.getAgeofstudent()==student2.getAgeofstudent()&&!student1.getNameofstudent().equals(student2.getNameofstudent()))
        {
            return student1.getNameofstudent().compareToIgnoreCase(student2.getNameofstudent());
        }
        else
        {
            return student1.getId()-student2.getId();
        }
    }
}