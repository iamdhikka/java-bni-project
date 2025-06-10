package com.bni.bni.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bni.bni.entity.Profile;
import com.bni.bni.repository.ProfileRepository;

@Service
public class ProfileService {
    @Autowired
    private ProfileRepository repo;

    public List<Profile> getAll() {
        return repo.findAll();
    }

    public Profile getById(Long id) {
        return repo.findById(id).orElseThrow(() -> new RuntimeException("Not Found"));
    }

    public Profile save(Profile profile) {
        return repo.save(profile);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}

