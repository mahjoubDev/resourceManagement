package com.proxym.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proxym.domain.Categorie;
import com.proxym.domain.Reservation;

/**
 * Spring data repository for the {@link Reservation} entity.
 * 
 * @author Nessrine
 * @version 1.0
 *
 */
public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
