package com.bni.bni.entity;

import jakarta.persistence.*;
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

    // Getters and Setters
}
