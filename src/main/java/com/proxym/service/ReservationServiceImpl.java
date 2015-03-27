package com.proxym.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.proxym.business.ReservationInfo;
import com.proxym.domain.Reservation;
import com.proxym.domain.Resource;
import com.proxym.domain.User;
import com.proxym.exception.GestionResourceException;
import com.proxym.repositories.ReservationRepository;
import com.proxym.repositories.ResourceRepository;
import com.proxym.repositories.UserRepository;

/**
 * Service class for managing Reservations.
 * 
 * @author Nessrine
 * @version 1.0
 *
 */
public class ReservationServiceImpl implements ReservationService {
	
	/**
	 * Reservation repository.
	 */
	@Autowired
	private ReservationRepository reservationRepository;
	
	/**
	 * User repository.
	 */
	@Autowired
	private UserRepository userRepository;
	
	/**
	 * resource repository.
	 */
	@Autowired
	private ResourceRepository resourceRepository;
	
	/**
	 * The logger instance . All log messages from this class are routed through
	 * this member.
	 */
	private final  static Logger LOGGER = LoggerFactory.getLogger(ReservationServiceImpl.class);

	/**
	 * {@inheritDoc}.
	 */
	public void addReservation(ReservationInfo reservationInfo)
			throws GestionResourceException {
		
		LOGGER.debug("add new reservation to data base ", reservationInfo);
		User user=userRepository.findByLogin(reservationInfo.getLoginUser());
		Resource resource=resourceRepository.findByReference(reservationInfo.getReferenceResourcee());
		Reservation reservation=reservationInfo.toDomain();
		reservation.setUser(user);
		reservation.setResource(resource);
		reservationRepository.save(reservation);
		
	}

	/**
	 * {@inheritDoc}.
	 */
	public void updateReservation(ReservationInfo reservationInfo)
			throws GestionResourceException {
		
		LOGGER.debug("upadte existing reservation to data base ", reservationInfo);
		User user=userRepository.findByLogin(reservationInfo.getLoginUser());
		Resource resource=resourceRepository.findByReference(reservationInfo.getReferenceResourcee());
		Reservation reservation=reservationInfo.toDomain();
		reservation.setUser(user);
		reservation.setResource(resource);
		reservationRepository.save(reservation);
		
	}

	/**
	 * {@inheritDoc}.
	 */
	public void deleteReservation(ReservationInfo reservationInfo)
			throws GestionResourceException {
		
		LOGGER.debug("delete reservation fom  data base ", reservationInfo);
		reservationRepository.delete(reservationInfo.toDomain());
		
	}

}
