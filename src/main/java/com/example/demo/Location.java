package com.example.demo;

import javax.persistence.*;
import java.util.List;

@Entity
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String latitude;
    private String longitude;
    private String country;
    private String city;
    private String state;
    private String postCode;
    private String address;
    @OneToMany(mappedBy = "location",fetch = FetchType.LAZY)
    private List<Cinema> cinemaList;
}
