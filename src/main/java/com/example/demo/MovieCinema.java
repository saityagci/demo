package com.example.demo;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class MovieCinema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Movie movie;
    @ManyToOne
    private Cinema cinema;
    private Date dateTime;
    @OneToMany(mappedBy = "movieCinema",fetch = FetchType.LAZY)
    private List<Ticket> ticketList;
}
