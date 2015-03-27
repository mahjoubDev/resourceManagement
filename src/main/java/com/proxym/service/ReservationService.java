package com.proxym.service;

import com.proxym.business.ReservationInfo;
import com.proxym.domain.Reservation;
import com.proxym.exception.GestionResourceException;


/**
 * Contains  the services related to {@link Reservation}.
 * 
 * @author Nessrine
 * @version 1.0
 *
 */
public interface ReservationService {
	
	/**
	 * add new reservation.
	 * 
	 * @param reservationInfo
	 * @throws GestionResourceException
	 */
	public void addReservation (ReservationInfo reservationInfo) throws GestionResourceException;
	
	/**
	 * update existing reservation.
	 * 
	 * @param reservationInfo
	 * @throws GestionResourceException
	 */
	public void updateReservation (ReservationInfo reservationInfo) throws GestionResourceException;
	
	/**
	 * delete existing reservation.
	 * 
	 * @param reservationInfo
	 * @throws GestionResourceException
	 */
	public void deleteReservation (ReservationInfo reservationInfo) throws GestionResourceException;

}
