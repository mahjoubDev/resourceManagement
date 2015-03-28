package com.proxym.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proxym.business.ResourceInfo;
import com.proxym.domain.Categorie;
import com.proxym.domain.Resource;
import com.proxym.exception.GestionResourceException;
import com.proxym.repositories.CategorieRepository;
import com.proxym.repositories.ResourceRepository;

/**
 * Service class for managing Resources.
 * 
 * @author Nessrine
 * @version 1.0
 *
 */
@Service("resourceService")
public class ResourceServiceImpl implements ResourceService {

	/**
	 * Resource repository.
	 */
	@Autowired
	private ResourceRepository resourceRepository;
	
	/**
	 * categiry repository.
	 * 
	 */
	@Autowired
	private CategorieRepository categorieRepository;
	
	/**
	 * The logger instance . All log messages from this class are routed through
	 * this member.
	 */
	private final  static Logger LOGGER = LoggerFactory.getLogger(ResourceServiceImpl.class);

	/**
	 * {@inheritDoc}.
	 */
	public void addResource(ResourceInfo resourceInfo)
			throws GestionResourceException {
		
		LOGGER.debug("add new resource to data base ", resourceInfo);
		Categorie ExistingCategory=categorieRepository.findByReference(resourceInfo.getReferenceCategory());
		Resource resource=resourceInfo.toDomain();
		resource.setCategory(ExistingCategory);
		resourceRepository.save(resource);
		
	}

	/**
	 * {@inheritDoc}.
	 */
	public void updateResource(ResourceInfo resourceInfo)
			throws GestionResourceException {
		
		LOGGER.debug("update existing resource into  data base ", resourceInfo);
		Categorie ExistingCategory=categorieRepository.findByReference(resourceInfo.getReferenceCategory());
		Resource resource=resourceInfo.toDomain();
		resource.setCategory(ExistingCategory);
		resourceRepository.save(resource);
		
	}

	/**
	 * {@inheritDoc}.
	 */
	public void deleteResource(ResourceInfo resourceInfo)
			throws GestionResourceException {
		
		LOGGER.debug("delete resource fom  data base ", resourceInfo);
		resourceRepository.delete(resourceInfo.toDomain());
		
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<Resource> findAll() throws GestionResourceException {
		
		LOGGER.debug("get all the resources ewisting in the data base");
		return resourceRepository.findAll();
	}


}
