package com.example.demo;

import javax.persistence.*;
import java.util.List;

@Entity
public class Cinema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String sponsorName;
    @OneToMany(mappedBy = "cinema",fetch = FetchType.LAZY)
    private List<MovieCinema> movieCinemaList;
    @ManyToOne
    private Location location;
}
