package com.proxym.domain;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.proxym.enums.TypeDate;



/** Resource  object is a representation of Resource data.
 * 
 * @author Nessrine
 * @version 1.0.
 *
 */
@JsonIgnoreProperties({"id","category"})
@SuppressWarnings("serial")
@Entity
public class Resource implements Serializable {
	
	/**
	 * Primary key.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
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
	 * the type of date it can be hour, day or week.
	 */
	@Enumerated(EnumType.STRING)
	private TypeDate typeDate;
	
	/**
	 * the max of duration for a given reservation.
	 */
	private Integer dureeMax;
	
	/**
	 * category which the resource belong to.
	 */
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "category")
	private Categorie category;

	/**
	 * default constructor.
	 */
	public Resource() {
		
	}

	/*
	 * Getters and Setters.
	 */
	
	/**
	 * Returns the resource's ID.
	 * 
	 * @return A <code>Long</code> containing the 
	 * resource's ID.
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Sets the resource's ID.
	 * 
	 * @param id  A <code>Long</code> containing the 
	 * new resource's ID.
	 */
	public void setId(Long id) {
		this.id = id;
	}

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
	 * Get the type of date.
	 * 
	 * @return A object representing the type of date.
	 */
	public TypeDate getTypeDate() {
		return typeDate;
	}

	/**
	 * Sets  the type of date.
	 * 
	 * @param typeDate A object representing the new 
	 * type of date.
	 */
	public void setTypeDate(TypeDate typeDate) {
		this.typeDate = typeDate;
	}
	
	/**
	 * the max of duration.
	 * 
	 * @return A <code>integer</code> containing the max 
	 * of duration.
	 */
	public Integer getDureeMax() {
		return dureeMax;
	}

	/**
	 * The max of duration.
	 * 
	 * @param dureeMax A <code>integer</code> containing the max 
	 * of duration.
	 */
	public void setDureeMax(Integer dureeMax) {
		this.dureeMax = dureeMax;
	}

	/**
	 * returns the resource's category.
	 * 
	 * @return The category object which the resource 
	 * belong to. 
	 */
	public Categorie getCategory() {
		return category;
	}

	/**
	 * Sets the resource's category.
	 * 
	 * @param categorie The new category object which the resource 
	 * belong to.
	 */
	public void setCategory(Categorie category) {
		this.category = category;
	}
	
	
}
