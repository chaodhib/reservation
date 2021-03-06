package com.chaouki.icc.reservations.entities;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Table(name = "representation_user")
@Entity
public class Booking {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer id;
    @ManyToOne
    private Representation representation;
    @ManyToOne
    private User user;
    private Integer places;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Representation getRepresentation() {
        return representation;
    }

    public void setRepresentation(Representation representation) {
        this.representation = representation;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getPlaces() {
        return places;
    }

    public void setPlaces(Integer places) {
        this.places = places;
    }
}
