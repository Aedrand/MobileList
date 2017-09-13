package com.example.ariggs.listapplication;

/**
 * Created by ariggs on 9/13/17.
 */

public class Student {
    private String name;
    private String gradeYear;
    private String major;

    public Student(String thisName, String thisGradeYear, String thisMajor) {
        this.name = thisName;
        this.gradeYear = thisGradeYear;
        this.major = thisMajor;
    }

    public void setName(String setName) {
        this.name = setName;
    }

    public void setGradeYear(String setYear) {
        this.gradeYear = setYear;
    }

    public void setMajor(String setMajor) {
        this.major = setMajor;
    }

    public String getName() {
        return this.name;
    }

    public String getGradeYear() {
        return this.gradeYear;
    }

    public String getMajor() {
        return this.major;
    }
}
