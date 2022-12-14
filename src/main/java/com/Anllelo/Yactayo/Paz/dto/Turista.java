package com.Anllelo.Yactayo.Paz.dto;

import lombok.Data;

@Data
public class Turista {
	
	private Integer idTurista;
	private String nombreTurista;
	private String nroCelular;
	private String Direccion;
	
	
	@Override
	public String toString() {
		return "Turista [idTurista=" + idTurista + ", nombreTurista=" + nombreTurista + ", nroCelular=" + nroCelular
				+ ", Direccion=" + Direccion + "]";
	}


	public Integer getIdTurista() {
		return idTurista;
	}


	public void setIdTurista(Integer idTurista) {
		this.idTurista = idTurista;
	}


	public String getNombreTurista() {
		return nombreTurista;
	}


	public void setNombreTurista(String nombreTurista) {
		this.nombreTurista = nombreTurista;
	}


	public String getNroCelular() {
		return nroCelular;
	}


	public void setNroCelular(String nroCelular) {
		this.nroCelular = nroCelular;
	}


	public String getDireccion() {
		return Direccion;
	}


	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	
	
	
	

}
