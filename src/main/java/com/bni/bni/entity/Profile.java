package com.bni.bni.entity;

import jakarta.persistence.*;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.Date;

@Entity
@Table(name = "profiles")
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private Instant createdAt;
    private Instant updateAt;
    private String placeOfBirth;

    @PrePersist
    protected void onCreate() {
        this.createdAt = Instant.now();
        this.updateAt = Instant.now();
    }

    @PreUpdate
    protected void onUpdate() {
        this.updateAt = Instant.now();
    }

    public void setUserId(Long userId) {
    this.userId = userId;
}

public Long getUserId() {
    return userId;
}

public void setFirstName(String firstName2) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'setFirstName'");
}

public void setPlaceOfBirth(String placeOfBirth2) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'setPlaceOfBirth'");
}

public void setLastName(String lastName2) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'setLastName'");
}

public void setDateOfBirth(Date dateOfBirth2) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'setDateOfBirth'");
}

public void setCreatedAt(Timestamp timestamp) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'setCreatedAt'");
}

public void setUpdateAt(Timestamp timestamp) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'setUpdateAt'");
}

    // Getters and Setters
}
