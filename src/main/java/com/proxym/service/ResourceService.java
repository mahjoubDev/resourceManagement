package com.proxym.service;

import java.util.List;

import com.proxym.business.ResourceInfo;
import com.proxym.domain.Reservation;
import com.proxym.domain.Resource;
import com.proxym.exception.GestionResourceException;

/**
 * Contains  the services related to {@link Resource}.
 * 
 * @author Nessrine
 * @version 1.0
 *
 */
public interface ResourceService {
	
	/**
	 * add new resource.
	 * 
	 * @param resourceInfo
	 * @throws GestionResourceException indicates there is problem.
	 */
	public void addResource (ResourceInfo resourceInfo) throws GestionResourceException;
	
	/**
	 * update existing resource.
	 * 
	 * @param resourceInfo
	 * @throws GestionResourceException indicates there is problem.
	 */
	public void updateResource (ResourceInfo resourceInfo) throws GestionResourceException;
	
	/**
	 * delete existing resource.
	 * 
	 * @param resourceInfo
	 * @throws GestionResourceException indicates there is problem.
	 */
	public void deleteResource (ResourceInfo resourceInfo) throws GestionResourceException;
	
	/**
	 * Get all the resources existing in the system.
	 * 
	 * @throws GestionResourceException indicates there is problem.
	 */
	public List<Resource> findAll ()  throws GestionResourceException ;

}
