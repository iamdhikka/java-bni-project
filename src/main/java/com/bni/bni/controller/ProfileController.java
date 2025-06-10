package com.bni.bni.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bni.bni.entity.Profile;
import com.bni.bni.service.ProfileService;

@RestController
@RequestMapping("/api/profiles")
public class ProfileController {
    @Autowired
    private ProfileService service;

    @GetMapping
    public List<Profile> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Profile getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public Profile create(@RequestBody Profile profile) {
        return service.save(profile);
    }

    @PutMapping("/{id}")
    public Profile update(@PathVariable Long id, @RequestBody Profile profile) {
        profile.setId(id);
        return service.save(profile);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}