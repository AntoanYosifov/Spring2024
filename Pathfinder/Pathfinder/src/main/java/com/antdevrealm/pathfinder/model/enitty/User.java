package com.antdevrealm.pathfinder.model.enitty;

import com.antdevrealm.pathfinder.model.enums.UserLevel;
import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User extends BaseEntity {
    private String username;

    private String password;

    @Column(name = "full_name")
    private String fullName;

    private String email;
    @Enumerated(EnumType.STRING)
    private UserLevel level;

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getFullName() {
        return fullName;
    }

    public User setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public UserLevel getLevel() {
        return level;
    }

    public User setLevel(UserLevel level) {
        this.level = level;
        return this;
    }
}
