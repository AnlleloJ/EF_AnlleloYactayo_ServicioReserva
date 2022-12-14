package com.Anllelo.Yactayo.Paz.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class ReservaTurista implements Serializable {
	
	private static final long serialVersionUID =-903088411L ;
	
	
	@Column(name="idReserva", nullable = false, unique = true)
	private Integer idReserva;
	
	@Column(name="id_Turista", nullable = false, unique = true)
	private Integer idTurista;
	

}
