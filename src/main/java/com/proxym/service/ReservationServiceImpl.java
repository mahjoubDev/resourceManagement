package com.proxym.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.proxym.business.ReservationInfo;
import com.proxym.domain.Reservation;
import com.proxym.domain.Resource;
import com.proxym.exception.GestionResourceException;
import com.proxym.repositories.ReservationRepository;
import com.proxym.repositories.ResourceRepository;
import com.proxym.utils.ResourceValidator;

/**
 * Service class for managing Reservations.
 * 
 * @author Nessrine
 * @version 1.0
 * 
 */
@Service("reservationService")
public class ReservationServiceImpl implements ReservationService {

	/**
	 * Reservation repository.
	 */
	@Autowired
	private ReservationRepository reservationRepository;

	/**
	 * resource repository.
	 */
	@Autowired
	private ResourceRepository resourceRepository;

	/**
	 * The logger instance . All log messages from this class are routed through this member.
	 */
	private final static Logger LOGGER = LoggerFactory.getLogger(ReservationServiceImpl.class);

	/*
	 * (non-Javadoc)
	 * @see com.proxym.service.ReservationService#addReservation(com.proxym.business.ReservationInfo)
	 */
	public void addReservation(ReservationInfo reservationInfo) throws GestionResourceException {

		LOGGER.debug("add new reservation to data base ", reservationInfo);

		// check if the coming resource exists in the system otherwise throw exception
		Resource resource = resourceRepository.findByReference(reservationInfo.getReferenceResourcee());
		ResourceValidator.checkResourceExist(reservationInfo.getReferenceResourcee(), resource);
		
		//check if the resource is available 
//		Reservation reservationResource=reservationRepository.findByReferenceResource(resource.getReference());
//		ResourceValidator.checkResourceAvailable(resource.getReference(), reservationResource);
//
//		// verify the possibility of the reservation.
//		ResourceValidator.checkReservationPossible(resource, reservationInfo);

		// add the new reservation to data base.
		
		Reservation reservation = reservationInfo.toDomain();
		reservation.setLoginUser(reservationInfo.getLoginUser());
		reservation.setResource(resource);
		reservationRepository.save(reservation);

	}

	/*
	 * (non-Javadoc)
	 * @see com.proxym.service.ReservationService#updateReservation(java.lang.String, com.proxym.business.ReservationInfo)
	 */
	public void updateReservation(String referenceReservation, ReservationInfo reservationInfo)
			throws GestionResourceException {

		LOGGER.debug("upadte existing reservation to data base ", reservationInfo);

		// check if the reservation with the target refernece exists in th data base
		Reservation existingReservation = reservationRepository.findByreference(referenceReservation);
		ResourceValidator.checkReservationExist(referenceReservation, existingReservation);


		// check if the coming resource exists in the system otherwise throw exception
		Resource resource = resourceRepository.findByReference(reservationInfo.getReferenceResourcee());
		ResourceValidator.checkResourceExist(reservationInfo.getReferenceResourcee(), resource);

		// verify the possibility of the reservation.
		ResourceValidator.checkReservationPossible(resource, reservationInfo);

		// update the rservation with the coming informations.
		Reservation reservation = reservationInfo.toDomain();
		reservation.setId(existingReservation.getId());
		reservation.setLoginUser(reservationInfo.getLoginUser());
		// reservation.setResource(resource);
		reservationRepository.save(reservation);

	}

	/*
	 * (non-Javadoc)
	 * @see com.proxym.service.ReservationService#deleteReservation(java.lang.String)
	 */
	public void deleteReservation(String referenceReservation) throws GestionResourceException {

		LOGGER.debug("delete reservation fom  data base ", referenceReservation);

		// check if the reservation with the target refernece exists in th data base
		Reservation existingReservation = reservationRepository.findByreference(referenceReservation);
		ResourceValidator.checkReservationExist(referenceReservation, existingReservation);

		// delete the reservation.
		reservationRepository.delete(existingReservation);

	}

	/*
	 * (non-Javadoc)
	 * @see com.proxym.service.ReservationService#findAll()
	 */
	@Override
	public List<Reservation> findAll() throws GestionResourceException {

		LOGGER.debug("get all the reservation from the system.");
		return reservationRepository.findAll();
	}

	/*
	 * (non-Javadoc)
	 * @see com.proxym.service.ReservationService#getReservationListBeforFiftyMinutes()
	 */
	@Override
	public List<Reservation> getReservationListBeforFiftyMinutes() throws GestionResourceException {
		
		LOGGER.debug("Get the reservations for sending mails");
		return reservationRepository.getReservationListBeforFiftyMinutes();
	}

}
