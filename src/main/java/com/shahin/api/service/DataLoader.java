package com.shahin.api.service;

import com.shahin.api.model.Employee;
import com.shahin.api.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void run(String... args) throws Exception {
        // Save employees from data.sql to the database
        employeeRepository.saveAll(List.of(
                new Employee("Laurent", "GINA", "laurentgina@mail.com", "laurent"),
                new Employee("Sophie", "FONCEK", "sophiefoncek@mail.com", "sophie"),
                new Employee("Agathe", "FEELING", "agathefeeling@mail.com", "agathe")
        ));
    }
}

