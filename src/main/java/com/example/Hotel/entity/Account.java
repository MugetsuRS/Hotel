package com.example.Hotel.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long accountId;

    private String name;
    private String surrname;
    private String password;
    private String email;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<MyTrips> mytrips;

    public void addTrip(final MyTrips newTrip) {
        mytrips.add(newTrip);
    }

    public Account(String name, String surrname, String password, String email, List<MyTrips> mytrips) {
        this.name = name;
        this.surrname = surrname;
        this.password = password;
        this.email = email;
        this.mytrips = mytrips;
    }

    public Account() {

    }

    public Long getAccountId() {
        return accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurrname() {
        return surrname;
    }

    public void setSurrname(String surrname) {
        this.surrname = surrname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<MyTrips> getMytrips() {
        return mytrips;
    }

    public void setMytrips(List<MyTrips> mytrips) {
        this.mytrips = mytrips;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", name='" + name + '\'' +
                ", surrname='" + surrname + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", mytrips=" + mytrips +
                '}';
    }
}
