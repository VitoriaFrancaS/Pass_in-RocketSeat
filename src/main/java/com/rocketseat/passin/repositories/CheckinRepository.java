package com.rocketseat.passin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rocketseat.passin.domain.Checkin;

public interface CheckinRepository extends JpaRepository<Checkin, Integer> {

}
