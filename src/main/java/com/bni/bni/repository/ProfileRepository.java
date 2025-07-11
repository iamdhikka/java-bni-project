package com.bni.bni.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bni.bni.entity.Profile;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long> {
}