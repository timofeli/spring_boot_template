package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentConfig {
    private StudentRepository repository;

    @Bean
    CommandLineRunner commandLineRunner(){
        return args -> {
Student mariam = new Student(
        "Mariam",
        "mariam.gmail@com",
        LocalDate.of(2020, Month.JANUARY,06)

);
            Student alex = new Student(

                    "alex",
                    "alex.gmail@com",
                    LocalDate.of(2020, Month.APRIL,06)

            );
            Student kentaaro = new Student(
                    1l,
                    "Kentaaro",
                    "kentaaro.gmail@com",
                    LocalDate.of(2020, Month.MAY,06)

            );

           repository.saveAll(List.of(mariam, alex, kentaaro));

        };

    }
}
