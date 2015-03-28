package com.proxym.service;

import java.util.List;

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
import com.proxym.utils.ResourceValidator;

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

		//check if the coming user exists in the system otherwise throw exception
		User user=userRepository.findByLogin(reservationInfo.getLoginUser());
		ResourceValidator.checkUserExist(reservationInfo.getLoginUser(), user);

		//check if the coming resource exists in the system otherwise throw exception
		Resource resource=resourceRepository.findByReference(reservationInfo.getReferenceResourcee());
		ResourceValidator.checkResourceExist(reservationInfo.getReferenceResourcee(), resource);

		//add the new reservation to data base.
		Reservation reservation=reservationInfo.toDomain();
		reservation.setUser(user);
		reservation.setResource(resource);
		reservationRepository.save(reservation);

	}

	/**
	 * {@inheritDoc}.
	 */
	public void updateReservation(String referenceReservation,ReservationInfo reservationInfo)
			throws GestionResourceException {

		LOGGER.debug("upadte existing reservation to data base ", reservationInfo);

		//check if the reservation with the target refernece exists in th data base
		Reservation existingReservation=reservationRepository.findByreference(referenceReservation);
		ResourceValidator.checkReservationExist(referenceReservation, existingReservation);

		//check if the coming user exists in the system otherwise throw exception
		User user=userRepository.findByLogin(reservationInfo.getLoginUser());
		ResourceValidator.checkUserExist(reservationInfo.getLoginUser(), user);

		//check if the coming resource exists in the system otherwise throw exception
		Resource resource=resourceRepository.findByReference(reservationInfo.getReferenceResourcee());
		ResourceValidator.checkResourceExist(reservationInfo.getReferenceResourcee(), resource);

		//update the rservation with the coming informations.
		Reservation reservation=reservationInfo.toDomain();
		reservation.setId(existingReservation.getId());
		reservation.setUser(user);
		reservation.setResource(resource);
		reservationRepository.save(reservation);

	}

	/**
	 * {@inheritDoc}.
	 */
	public void deleteReservation(String referenceReservation)
			throws GestionResourceException {

		LOGGER.debug("delete reservation fom  data base ", referenceReservation);

		//check if the reservation with the target refernece exists in th data base
		Reservation existingReservation=reservationRepository.findByreference(referenceReservation);
		ResourceValidator.checkReservationExist(referenceReservation, existingReservation);

		//delete the reservation.
		reservationRepository.delete(existingReservation);

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<Reservation> findAll() throws GestionResourceException {

		LOGGER.debug("get all the reservation from the system.");
		return reservationRepository.findAll();
	}

}
