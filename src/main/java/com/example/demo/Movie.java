package com.example.demo;

import com.example.demo.enums.State;
import com.example.demo.enums.Type;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity

public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private BigDecimal price;
    @Enumerated(value = EnumType.STRING)
    private Type type;
    @Enumerated(value = EnumType.STRING)
    private State state;
    @Column(columnDefinition = "DATE")
    private Date releaseDate;
    private int duration;
    private String summary;
    @ManyToMany
  //  @JoinTable(name = "movie_genre_rel")
    private Set<Genre> genreList;
    @OneToMany(mappedBy = "movie",fetch = FetchType.LAZY)
    private List<MovieCinema> movieCinemaList;

}
