package com.George.ems.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;



@Data
@Entity
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    @Column(unique = true)  // Ensures uniqueness at the database level
    private String username;
    private String password;
    @NotNull(message = "role cannot be null")
    private String role;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "department_id", referencedColumnName = "id")
    private Department department;
}
