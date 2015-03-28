package com.proxym.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proxym.domain.Categorie;
import com.proxym.domain.Reservation;
import com.proxym.exception.GestionResourceException;

/**
 * Spring data repository for the {@link Reservation} entity.
 * 
 * @author Nessrine
 * @version 1.0
 *
 */
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
	
	public static final String GET_RESERVATION_WITH_ONLY_15_MINUTES_REMAINING="SELECT * FROM reservation r"
			+"WEHERE ";
	
	/**
	 * gets the reservation that matches the given reference.
	 * 
	 * @param reference reference of the reservation.
	 * 
	 * @return An object reservation that matches the reservation
	 * otherwise returns a null object if there is not any object
	 * with the reference.
	 * 
	 * @throws GestionResourceException indicates there is a problem.
	 */
	public Reservation findByreference(String reference) throws GestionResourceException;

}
