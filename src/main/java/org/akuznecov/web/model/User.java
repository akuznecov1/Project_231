package org.akuznecov.web.model;

import javax.persistence.*;

@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    private long id;
    @Column(name="first_name", nullable = false)
    private String firstName;
    @Column(name="second_name", nullable = false)
    private String secondName;
    @Column(name="car", nullable = false)
    private String car;

    public User() {
    }

    public User(long id, String firstName, String secondName, String car) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.car = car;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }
}