package com.example;

public class MainApp {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();

        // Create
        Student s1 = new Student("Rishi Kumar", "Java");
        dao.createStudent(s1);

        // Read
        Student fetched = dao.getStudent(s1.getId());
        System.out.println("Fetched: " + fetched.getName());

        // Update
        fetched.setCourse("Spring Boot");
        dao.updateStudent(fetched);

        // Delete
        dao.deleteStudent(fetched.getId());
    }
}
