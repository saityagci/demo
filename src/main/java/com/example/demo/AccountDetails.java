package com.example.demo;

import com.example.demo.enums.Role;

import javax.persistence.*;

@Entity
public class AccountDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private String country;
    private String city;
    private String state;
    private String postalCode;
    private int age;
    @Enumerated(value = EnumType.STRING)
    private Role role;
    @OneToOne(mappedBy = "accountDetails")
    private UserAccount userAccount;
}
