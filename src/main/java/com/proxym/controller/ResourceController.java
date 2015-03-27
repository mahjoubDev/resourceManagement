package com.proxym.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.proxym.business.ResourceInfo;
import com.proxym.exception.GestionResourceException;
import com.proxym.service.ResourceService;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

/**
 * Rest controller for managing the Resource.
 * 
 * @author Nessrine
 * @version 1.0
 */
@Api(basePath = "/proxym", value = "Resource", description = "Operations with resources", produces = "application/json")
@RestController
@RequestMapping("/proxym/resource")
public class ResourceController {
	
	/**
	 * Resource service {@link ResourceInfo}.
	 */
	@Autowired
	private ResourceService resourceService;
	
	/**
	 * The logger instance . All log messages from this class are routed through
	 * this member.
	 */
	private final  static Logger LOGGER = LoggerFactory.getLogger(ResourceController.class);
	
	/**
	 * add new resource.
	 * 
	 * @param resource
	 * @throws GestionResourceException
	 */
	@RequestMapping(value="/add",method=RequestMethod.POST,produces = "application/json")
	@ApiOperation(value = "Create new Resource", notes = "Creates new Resource")
	public void addResource (@RequestBody ResourceInfo resourceInfo) throws GestionResourceException{
		
		LOGGER.debug("add new resource from controller ", resourceInfo);
		resourceService.addResource(resourceInfo);
	}
	
	/**
	 * update existing resource.
	 * 
	 * @param resourceInfo
	 * @throws GestionResourceException
	 */
	@RequestMapping(value="/update",method=RequestMethod.POST,produces = "application/json")
	@ApiOperation(value = "Update existing resource", notes = "Update existing resource")
	public void updateResource (@RequestBody ResourceInfo resourceInfo) throws GestionResourceException{
		
		LOGGER.debug("aupdate existing resource from controller ", resourceInfo);
		resourceService.updateResource(resourceInfo);
		
	}
	
	/**
	 * delete existing resource.
	 * 
	 * @param resourceInfo
	 * @throws GestionResourceException
	 */
	@RequestMapping(value="/delete",method=RequestMethod.POST,produces = "application/json")
	@ApiOperation(value = "Delete existing resource", notes = "Delete existing resource")
	public void deleteResource (ResourceInfo resourceInfo) throws GestionResourceException{
		
		LOGGER.debug("delete existing resource from controller ", resourceInfo);
		resourceService.deleteResource(resourceInfo);
		
	}
	

}
