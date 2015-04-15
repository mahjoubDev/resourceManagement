package com.proxym.jsf.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RestController;

import com.proxym.controller.ResourceController;

/**
 * Backed bean for managing the resources
 * views.
 * 
 * @author Nessrine
 * @version 1.0
 *
 */
@RestController
@Scope("view")
public class JsfResourceController {
	
	/**
	 * The logger instance . All log messages from this class are routed through this member.
	 */
	private final static Logger LOGGER = LoggerFactory.getLogger(JsfResourceController.class);
	
	/**
	 * {@link ResourceController}
	 */
	private ResourceController resourceController;

}
