package com.proxym.service;

import com.proxym.business.ResourceInfo;
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
	 * @throws GestionResourceException
	 */
	public void addResource (ResourceInfo resourceInfo) throws GestionResourceException;
	
	/**
	 * update existing resource.
	 * 
	 * @param resourceInfo
	 * @throws GestionResourceException
	 */
	public void updateResource (ResourceInfo resourceInfo) throws GestionResourceException;
	
	/**
	 * delete existing resource.
	 * 
	 * @param resourceInfo
	 * @throws GestionResourceException
	 */
	public void deleteResource (ResourceInfo resourceInfo) throws GestionResourceException;

}
