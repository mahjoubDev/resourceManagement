package com.proxym.business;

import com.proxym.domain.Resource;

public class ResourceInfo {
	
	/**
	 * Reference of the resource.
	 */
	private String reference;
	
	/**
	 * Name of the resource.
	 */
	private String name;
	
	/**
	 * dDescription of the resource.
	 */
	private String description;
	
	/**
	 * category which the resource belong to.
	 */
	private String referenceCategory;

	/**
	 * default constructor.
	 */
	public ResourceInfo() {
		
	}

	/*
	 * Getters and Setters.
	 */

	/**
	 * Returns the resource's reference.
	 * 
	 * @return A <code>String</code> containing the
	 * reference of resource.
	 */
	public String getReference() {
		return reference;
	}

	/**
	 * Sets the resource's reference.
	 * 
	 * @param reference A <code>String</code> containing the
	 * new  reference of resource.
	 */
	public void setReference(String reference) {
		this.reference = reference;
	}

	/**
	 * Returns the resource's name.
	 * 
	 * @return A <code>String</code> containing the
	 *   name of resource.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the resource's name.
	 * 
	 * @param name A <code>String</code> containing the
	 * new  name of resource.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/** 
	 * Returns the resource's description.
	 * 
	 * @return  A <code>String</code> containing the
	 *   description of resource.
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the resource's description.
	 * 
	 * @param description A <code>String</code> containing the
	 *  new  description of resource.
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * returns the resource's category.
	 * 
	 * @return A <code>String</code> containing the reference of
	 *  category object which the resource  belong to. 
	 */
	public String getReferenceCategory() {
		return referenceCategory;
	}

	/**
	 * Sets the resource's category.
	 * 
	 * @param  A <code>String</code> containing the new reference of
	 *  category object which the resource  belong to. 
	 */
	public void setReferenceCategory(String referenceCategory) {
		this.referenceCategory = referenceCategory;
	}
	
	/**
	 * create domain object from DTO one.
	 * 
	 * @return object Resouce ready to be persisted in
	 * data base.
	 * 
	 */
	public Resource toDomain(){
		Resource resource=new Resource();
		resource.setDescription(description);
		resource.setName(name);
		resource.setReference(reference);
		return resource;
	}
	
	

}
