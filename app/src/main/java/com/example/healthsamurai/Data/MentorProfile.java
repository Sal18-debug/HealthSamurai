package com.example.healthsamurai.Data;

import java.util.ArrayList;

public class MentorProfile {
    private String name;
    private String school;
    private ArrayList <String> listOfStudents;

    public MentorProfile(String name, String school, ArrayList<String> listOfStudents) {
        this.name = name;
        this.school = school;
        this.listOfStudents = listOfStudents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public ArrayList<String> getListOfStudents() {
        return listOfStudents;
    }

    public void setListOfStudents(ArrayList<String> listOfStudents) {
        this.listOfStudents = listOfStudents;
    }
}
