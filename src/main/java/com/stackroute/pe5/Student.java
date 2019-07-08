package com.stackroute.pe5;

public class Student {
    /*Member variables of student class*/
    private int id;
    private String nameofstudent;
    private int ageofstudent;

    public Student(int id, String nameofstudent, int ageofstudent) {
        this.id = id;
        this.nameofstudent = nameofstudent;
        this.ageofstudent = ageofstudent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameofstudent() {
        return nameofstudent;
    }

    public void setNameofstudent(String nameofstudent) {
        this.nameofstudent = nameofstudent;
    }

    public int getAgeofstudent() {
        return ageofstudent;
    }

    public void setAgeofstudent(int ageofstudent) {
        this.ageofstudent = ageofstudent;
    }
}
