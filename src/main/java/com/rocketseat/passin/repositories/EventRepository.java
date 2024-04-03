package com.rocketseat.passin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rocketseat.passin.domain.Event;

public interface EventRepository extends JpaRepository<Event, String> {
	
	

}
