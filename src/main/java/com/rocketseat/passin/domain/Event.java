package com.rocketseat.passin.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity //indica para o jpa que essa classe representa uma identidade 
@Table(name= "events") //qual o nome da tabela que esssa entidade representa
@Getter //gera o getters de forma automatica pra gente
@Setter //atualiza o valor de uma propriedade
@AllArgsConstructor //gera um construtor da classe que recebe todos os parametros que vai ter argumento 
@NoArgsConstructor //e os que não teram argumento
public class Event {
	
	@Id //a primary key da tabela event
	@Column(nullable = false) //indica que essa coluna não pode ser nula
	@GeneratedValue(strategy = GenerationType.UUID) //indica que esse valor será gerado automaticamente
	
	private String id;
	
	@Column(nullable = false) //indica que essa coluna não pode ser nula
	private String title;
	
	@Column(nullable = false) //indica que essa coluna não pode ser nula
	private String detail;
	
	@Column(nullable = false, unique = true) //indica que essa coluna não pode ser nula
	//indice unico não pode ter slug duplicado por isso acrescenta o unique
	private String slug;
	
	@Column(nullable = false, name = "maximum_attendees")//indica que a coluna está indicandp a coluna maximum 
	private Integer maximumAttendees;
	
	

}
