package com.proxym.jsf.beans;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RestController;

import com.proxym.controller.ResourceController;
import com.proxym.domain.Categorie;
import com.proxym.domain.Resource;
import com.proxym.exception.GestionResourceException;
import com.proxym.service.ResourceService;

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
	 * {@link ResourceService}
	 */
	@Autowired
	private ResourceService resourceService;
	
	/**
	 * the category selected by the user 
	 */
	private Categorie selectedCategory;
	
	/**
	 * {@link Resource}
	 */
	private Resource resourceToAdd = new Resource();
	
	/**
	 * Gets all the resources.
	 * 
	 * @return A <code>Collection</code> containing all the resources.
	 * 
	 * @throws GestionResourceException indicates there's problem.
	 */
	public List<Resource> getAllResources () throws GestionResourceException {
		
		LOGGER.debug("retieving all the resources existing in the system ");
		return resourceService.findAll();
	}

	/**
	 * 
	 * @return
	 */
	public Categorie getSelectedCategory() {
		return selectedCategory;
	}

	/**
	 * 
	 * @param selectedCategory
	 */
	public void setSelectedCategory(Categorie selectedCategory) {
		this.selectedCategory = selectedCategory;
	}

	/**
	 * 
	 * @return
	 */
	public Resource getResourceToAdd() {
		return resourceToAdd;
	}

	/**
	 * 
	 * @param resourceToAdd
	 */
	public void setResourceToAdd(Resource resourceToAdd) {
		this.resourceToAdd = resourceToAdd;
	}
	
	
	
}
