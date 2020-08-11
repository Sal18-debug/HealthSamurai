package com.example.healthsamurai.Data;

import java.util.ArrayList;

public class StudentProfile {

    private String name;
    private String school;
    private String mentorID;

    public StudentProfile( String name, String school, String mentorID) {
        this.name = name;
        this.school = school;
        this.mentorID = mentorID;
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

    public String getMentorIDmentorID() {
        return mentorID;
    }

    public void setMentorID(String mentorID) {
        this.mentorID = mentorID;
    }
}
