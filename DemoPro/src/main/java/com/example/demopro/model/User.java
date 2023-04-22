package com.example.demopro.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
//@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column(length = 255)
    private String code;
    @Column(length = 50)
    private String name;
    @Column(length = 500)
    private String address;
    @Column(length = 10)
    private String role;
}
