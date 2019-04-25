package com.airport.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Time;
import java.util.List;

@Document
public class Flight {
    @Id
    int id;
    String origin;
    String destination;
    String date;
    String time;
    boolean isLanded;
    Plane plane;
    List<User> users;

    public Flight(int id, String origin, String destination, String date, String time, boolean isLanded, Plane plane) {
        this.id = id;
        this.origin = origin;
        this.destination = destination;
        this.date = date;
        this.time = time;
        this.isLanded = isLanded;
        this.plane = plane;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public boolean isLanded() {
        return isLanded;
    }

    public void setLanded(boolean landed) {
        isLanded = landed;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
