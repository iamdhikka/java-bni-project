package com.bni.bni.controller;

import com.bni.bni.dto.CreateProfileRequest;
import com.bni.bni.entity.Profile;
import com.bni.bni.repository.ProfileRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/profiles")
public class ProfileController {

    @Autowired
    private ProfileRepository profileRepository;

    @PostMapping
    public Profile createProfile(@RequestBody CreateProfileRequest request) {
        Profile profile = new Profile();
        profile.setFirstName(request.firstName);
        profile.setLastName(request.lastName);
        profile.setDateOfBirth(request.dateOfBirth);
        profile.setPlaceOfBirth(request.placeOfBirth);
        profile.setUserId(1L); // default sementara; bisa diganti dengan ID user yang sedang login
        return profileRepository.save(profile);
    }
}
