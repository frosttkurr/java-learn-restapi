package com.frosttkurr.javaapidemo.configs;

import com.frosttkurr.javaapidemo.models.Student;
import com.frosttkurr.javaapidemo.repositories.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student frostt =  new Student(
                    "Frostt",
                    "frostt@gmail.com",
                    LocalDate.of(2000, Month.APRIL, 30)
            );

            Student kurr = new Student(
                    "kurr",
                    "frostt@gmail.com",
                    LocalDate.of(2001, Month.MAY, 15)
            );

            repository.saveAll(
                    List.of(frostt, kurr)
            );
        };
    }
}
