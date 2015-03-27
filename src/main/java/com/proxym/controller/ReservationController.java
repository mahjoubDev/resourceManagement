package com.proxym.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.proxym.business.ReservationInfo;
import com.proxym.exception.GestionResourceException;
import com.proxym.service.ReservationService;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

/**
 * Rest controller for managing the Reservation.
 * 
 * @author Nessrine
 * @version 1.0
 */
@Api(basePath = "/proxym", value = "Reservation", description = "Operations with booking", produces = "application/json")
@RestController
@RequestMapping("/proxym/reservation")
public class ReservationController {
	
	/**
	 * reservation service {@link ReservationService}.
	 */
	private ReservationService reservationService;
	
	/**
	 * The logger instance . All log messages from this class are routed through
	 * this member.
	 */
	private final  static Logger LOGGER = LoggerFactory.getLogger(ReservationController.class);
	
	/**
	 * add new reservation.
	 * 
	 * @param reservationInfo
	 * @throws GestionResourceException
	 */
	@RequestMapping(value="/add",method=RequestMethod.POST,produces = "application/json")
	@ApiOperation(value = "Create new booking", notes = "Create new booking booking")
	public void addReservation (ReservationInfo reservationInfo) throws GestionResourceException{
		
		LOGGER.debug("adding new reservation from controller ", reservationInfo);
		reservationService.addReservation(reservationInfo);

	}
	
	/**
	 * update existing reservation.
	 * 
	 * @param reservationInfo
	 * @throws GestionResourceException
	 */
	@RequestMapping(value="/update",method=RequestMethod.POST,produces = "application/json")
	@ApiOperation(value = "Update existing booking", notes = "Update existing booking")
	public void updateReservation (ReservationInfo reservationInfo) throws GestionResourceException{
		
		LOGGER.debug("updating  existing  reservation from controller ", reservationInfo);
		reservationService.updateReservation(reservationInfo);
		
	}
	
	/**
	 * delete existing reservation.
	 * 
	 * @param reservationInfo
	 * @throws GestionResourceException
	 */
	@RequestMapping(value="/delete",method=RequestMethod.POST,produces = "application/json")
	@ApiOperation(value = "Delete existing booking", notes = "Delete existing booking")
	public void deleteReservation (ReservationInfo reservationInfo) throws GestionResourceException{
		
		LOGGER.debug("deleting existing reservation from controller ", reservationInfo);
		reservationService.deleteReservation(reservationInfo);
		
	}
	

}
