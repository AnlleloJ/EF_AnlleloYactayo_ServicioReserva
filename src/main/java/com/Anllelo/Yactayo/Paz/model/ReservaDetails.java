package com.Anllelo.Yactayo.Paz.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;



@Data
@Entity
@Table(name="Reserva_Cliente")
public class ReservaDetails {
	
	@Id
	private ReservaTurista fk= new ReservaTurista();

}
