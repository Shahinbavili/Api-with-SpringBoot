package com.shahin.api.model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private String mail;

    private String password;

    public Employee(String firstName, String lastName, String mail, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mail = mail;
        this.password = password;
    }

    public Employee() {

    }
}
