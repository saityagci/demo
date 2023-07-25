package com.example.demo;

import javax.persistence.*;
import java.util.Date;

@Entity
public class MovieCinema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Movie movie;
    private Date dateTime;
}
