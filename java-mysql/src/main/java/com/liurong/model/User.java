package com.liurong.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
    private int id;
    private String userName;
    private String password;
    private String trueName;
    private int userAge;
    private String email;
    private String address;

    public User() {
    }

    public User(String userName, String password, String trueName, int userAge, String email, String address) {
        this.userName = userName;
        this.password = password;
        this.trueName = trueName;
        this.userAge = userAge;
        this.email = email;
        this.address = address;
    }

    public User(int id, String userName, String password, String trueName, int userAge, String email, String address){
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.trueName = trueName;
        this.userAge = userAge;
        this.email = email;
        this.address = address;
    }

    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTrueName() {
        return trueName;
    }

    public void setTrueName(String trueName) {
        this.trueName = trueName;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
