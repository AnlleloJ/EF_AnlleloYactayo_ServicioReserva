package com.Anllelo.Yactayo.Paz.service;

import java.util.List;

import com.Anllelo.Yactayo.Paz.model.Reserva;

public interface ReservaService {
	
	List<Reserva> listar();
	Reserva ObtenerId(Integer id);	
	void guardar(Reserva reserva);
	void eliminar(Integer id);
	void actualizar(Reserva reserva);	

	void asignarTuristaReserva();

}
