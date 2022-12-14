package com.Anllelo.Yactayo.Paz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Anllelo.Yactayo.Paz.client.OpenFeignTurista;
import com.Anllelo.Yactayo.Paz.model.Reserva;
import com.Anllelo.Yactayo.Paz.repository.ReservaRepository;
import com.Anllelo.Yactayo.Paz.repository.ReservaTuristaRepository;


@Service
public class ReservaServiceImpl implements ReservaService {

	
	
	@Autowired
	private ReservaRepository repository;
	
	@Autowired
	private ReservaTuristaRepository repositoryDetalle;
	
	
	@Autowired
	private OpenFeignTurista feign;
	
	
	@Override
	public List<Reserva> listar() {

		return repository.findAll();
	}

	@Override
	public Reserva ObtenerId(Integer id) {

		return repository.findById(id).orElse(null);
	}

	@Override
	public void guardar(Reserva reserva) {
		
		repository.save(reserva);

	}

	@Override
	public void eliminar(Integer id) {
		
		repository.deleteById(id);


	}

	@Override
	public void actualizar(Reserva reserva) {
		
		repository.saveAndFlush(reserva);

	}

	@Override
	public void asignarTuristaReserva() {



	}

}
