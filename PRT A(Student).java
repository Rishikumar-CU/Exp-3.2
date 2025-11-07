package com.example;

// Author: RISHI KUMAR | UID: 23BCS14134

public class Student {
    private Course course;

    public Student(Course course) {
        this.course = course;
    }

    public void showCourse() {
        System.out.println("Enrolled in course: " + course.getCourseName());
    }
}
