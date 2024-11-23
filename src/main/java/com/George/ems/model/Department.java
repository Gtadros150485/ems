package com.George.ems.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;


@Entity
@Data
public class Department {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;
        @NotNull
        @Column(unique = true)
        private String name;

        @OneToOne(mappedBy = "department", cascade = CascadeType.ALL)
        @NotNull(message = "AppUser cannot be null")
        private AppUser appUser;

}
