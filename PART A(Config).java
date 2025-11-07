package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Author: RISHI KUMAR | UID: 23BCS14134

@Configuration
public class AppConfig {

    @Bean
    public Course course() {
        return new Course();
    }

    @Bean
    public Student student() {
        return new Student(course());
    }
}
