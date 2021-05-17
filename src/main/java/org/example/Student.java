package org.example;

public class Student {

    String studentId;
    String name;
    int overallMark;

    public Student(String studentId, String name, int overallMark) {
        this.studentId = studentId;
        this.name = name;
        this.overallMark = overallMark;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOverallMark() {
        return overallMark;
    }

    public void setOverallMark(int overallMark) {
        this.overallMark = overallMark;
    }

    @Override
    public String toString() {
        return "Student Number: "+studentId+" Student Name: "+name+" Marks: "+overallMark;
    }
}
