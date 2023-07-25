package com.example.demo;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
   @ManyToMany(mappedBy = "genreList")
    private Set<Movie> movieList;


}
