package com.rocketseat.passin.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //O spring sabe que a classe significa o controle da minha aplicação 
@RequestMapping("/events") //mapeia os end points que esse controller vai ser responsavel por lidar 
public class EventController {

	
	@GetMapping
	public ResponseEntity<String> getTeste(){
		return ResponseEntity.ok("sucesso");
		 
	}

}
