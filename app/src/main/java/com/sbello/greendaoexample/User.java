package com.sbello.greendaoexample;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by socbe on 11/4/2017.
 */
@Entity
public class User {
    @Id
    public Integer id;
    public String username;
    public String email;
    @Generated(hash = 1395040512)
    public User(Integer id, String username, String email) {
        this.id = id;
        this.username = username;
        this.email = email;
    }
    @Generated(hash = 586692638)
    public User() {
    }
    public Integer getId() {
        return this.id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getUsername() {
        return this.username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
