package com.rocketseat.passin.domain;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;


@Entity
@Table(name= "attendees")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Attendee {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String Id;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private String email;
	
	//para relacionar a classe attendee com a event
	@ManyToOne //muitos para um
	@JoinColumn(name = "event_id", nullable= false) //fazer uma ligação com a coluna event id da classe event
	private Event event;
	
	@Column(name = "created_at")//definindo qual a coluna de onde irá vir a data
	private LocalDateTime createdAt;
}
