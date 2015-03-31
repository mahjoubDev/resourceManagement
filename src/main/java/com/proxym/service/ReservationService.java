package com.proxym.service;

import java.util.List;

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
	 * @throws GestionResourceException indicates there is a problem.
	 */
	public void addReservation (ReservationInfo reservationInfo) throws GestionResourceException;
	
	/**
	 * update existing reservation.
	 * 
	 * @param reservationInfo carries all the new information for the
	 *  updated reservation.
	 *  
	 * @param referenceReservation refrence of the target reservation.
	 * @throws GestionResourceException indicates there is a problem.
	 */
	public void updateReservation (String referenceReservation,ReservationInfo reservationInfo) throws GestionResourceException;
	
	/**
	 * delete existing reservation.
	 * 
	 * @param referenceReservation reference of the target reservation.
	 * 
	 * @throws GestionResourceException indicates there is a problem.
	 */
	public void deleteReservation (String referenceReservation) throws GestionResourceException;
	
	/**
	 * Gets all the reservations existing in the system.
	 * 
	 * @return A <code>Collection</code> containing all
	 * the reservations retrieved from the data base.
	 * 
	 * @throws GestionResourceException indicates there is a problem.
	 */
	public List<Reservation> findAll () throws GestionResourceException ;
	
	/**
	 * Gets alla the reservation before 15 minutes
	 * 
	 * @return A <code>Collection</code> containing all
	 * the reservations retrieved from the data base and it 
	 * remains 15 minute for starting.
	 * 
	 * @throws GestionResourceException indicates there is a problem.
	 */
	public List<Reservation> getReservationListBeforFiftyMinutes() throws GestionResourceException ;

}
