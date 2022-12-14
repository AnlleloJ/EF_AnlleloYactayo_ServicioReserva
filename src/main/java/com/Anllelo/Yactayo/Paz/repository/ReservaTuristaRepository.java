package com.Anllelo.Yactayo.Paz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Anllelo.Yactayo.Paz.model.ReservaDetails;


@Repository
public interface ReservaTuristaRepository extends JpaRepository <ReservaDetails, Integer>{

}
