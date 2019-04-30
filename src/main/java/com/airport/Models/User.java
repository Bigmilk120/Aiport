package com.airport.Models;

import com.airport.Enums.UserPrivileges;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public class User {
    @Id
    private int ID;
    private String firstName;
    private String lastName;
    private String password;
    private boolean isLogged;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private Date dateOfBirth;
    private UserPrivileges.PrivilegesUser privilege;

    public User() {
    }

    public User(int ID, String firstName, String lastName, Date dateOfBirth, UserPrivileges privilege) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.privilege = privilege.getPrivilege();
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public UserPrivileges.PrivilegesUser getPrivilege() {
        return privilege;
    }

    public void setPrivilege(UserPrivileges.PrivilegesUser privilege) {
        this.privilege = privilege;
    }
}
