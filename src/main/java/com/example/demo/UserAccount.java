package com.example.demo;

import javax.persistence.*;
import java.util.List;

@Entity
public class UserAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String password;
    private String username;
    @OneToMany(mappedBy = "userAccount",fetch = FetchType.LAZY)
    private List<Ticket> ticketList;
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="accountDetailsId")
    private AccountDetails accountDetails;
}
