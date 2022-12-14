package com.Anllelo.Yactayo.Paz.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.Anllelo.Yactayo.Paz.dto.Turista;


@FeignClient(name = "idat-turista", url="localhost: 8080")
public interface OpenFeignTurista {
	
	@GetMapping("/turista/v1/listar")
	public List<Turista> ListarTuristasSeleccionados();

}
