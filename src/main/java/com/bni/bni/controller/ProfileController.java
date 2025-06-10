package com.bni.bni.controller;

import com.bni.bni.dto.CreateProfileRequest;
import com.bni.bni.entity.Profile;
import com.bni.bni.repository.ProfileRepository;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/profiles")
public class ProfileController {

    @Autowired
    private ProfileRepository profileRepository;

    @PostMapping("/profiles")
public ResponseEntity<Profile> createProfile(@RequestBody CreateProfileRequest request) {
    Profile profile = new Profile();
    profile.setFirstName(request.getFirstName());
    profile.setLastName(request.getLastName());
    profile.setPlaceOfBirth(request.getPlaceOfBirth());
    profile.setDateOfBirth(request.getDateOfBirth());
    profile.setCreatedAt(new Timestamp(System.currentTimeMillis()));
    profile.setUpdateAt(new Timestamp(System.currentTimeMillis()));
    profile.setUserId(1L); // Default, atau ambil dari user login nanti

    Profile saved = profileRepository.save(profile);
    return ResponseEntity.ok(saved);
}
}
