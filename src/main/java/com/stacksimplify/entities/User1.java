package com.stacksimplify.entities;

import javax.persistence.*;

@Entity
@Table(name ="user")
public class User1 {
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "User_name",length = 50,nullable = false,unique = true)
    private String username;
    @Column(name = "first_NAME",length = 50,nullable = false)
    private String firstName;
    @Column(name = "Last_NAME",length = 50,nullable = false)
    private String lastName;
    @Column(name = "email",length = 50,nullable = false)
    private String email;
    @Column(name = "role",length = 50,nullable = false)
    private String role;
    @Column(name = "ssn",length = 50,nullable = false,unique = true)
    private String ssn;

    public User1() {
    }

    public User1(int id, String username, String firstName, String lastName, String email, String role, String ssn) {
        this.id = id;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.role = role;
        this.ssn = ssn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "User1{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", role='" + role + '\'' +
                ", ssn='" + ssn + '\'' +
                '}';
    }
}
