package com.proxym.jsf.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RestController;

import com.proxym.service.ReservationService;

/**
 * Backed bean for managing the Reservations 
 * views.
 * 
 * @author Nesrine
 * @version 1.0
 *
 */
@RestController
@Scope("view")
public class JsfReservationController {
	

	/**
	 * The logger instance . All log messages from this class are routed through this member.
	 */
	private final static Logger LOGGER = LoggerFactory.getLogger(JsfReservationController.class);

	/**
	 * {@link ReservationService}
	 */
	private ReservationService reservationService;
}
