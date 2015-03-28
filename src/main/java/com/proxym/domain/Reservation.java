package com.proxym.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/** Reservation  object is a representation of Reservations data.
 * 
 * @author Nessrine
 * @version 1.0.
 *
 */
@JsonIgnoreProperties({"id","user","resource"})
@SuppressWarnings("serial")
@Entity
public class Reservation implements Serializable {
	/**
	 * Primary key.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	/**
	 * reference of the resource.
	 */
	private String reference ;
	
	/**
	 * Date when the reservation starts.
	 */
	@Temporal(TemporalType.DATE)
	private Date dateStart ;
	
	/**
	 * Date when the reservation ends.
	 */
	@Temporal(TemporalType.DATE)
	private Date dateEnd ;
	
	/**
	 * Description of rservation's purpose.
	 */
	private String description;
	
	/**
	 * the duration of the occupation.
	 */
	private int duree;
	
	/**
	 * The User who are  doing the reservation.
	 */
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name="user")
	private User user ;
	
	/**
	 * List of resources related to this reservation.
	 */
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "resourceId", nullable = false)
	private Resource resource ;

	/**
	 * default constructor.
	 */
	public Reservation() {
		
	}

	/*
	 * Getters and Setters.
	 */
	
	/**
	 * Returns the reservation's ID.
	 *  
	 * @return A <code>Long</code> containing the id of
	 * the current reservation.
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Sets the reservation's ID.
	 * 
	 * @param idReservation A <code>Long</code> containing the id of
	 * the current reservation.
	 */
	public void setId(Long idReservation) {
		this.id = idReservation;
	}

	/**
	 * Returns the reservation's reference.
	 * 
	 * @return A <code>String</code> containing the refrence
	 * of the current reservation.
	 */
	public String getReference() {
		return reference;
	}

	/**
	 * Sets the reservation's reference.
	 * 
	 * @param reference A <code>String</code> containing the refrence
	 * of the current reservation.
	 */
	public void setReference(String reference) {
		this.reference = reference;
	}

	/**
	 * Returns the date of starting reservation.
	 * 
	 * @return A <code>Date</code> containing the 
	 * date of starting reservation.
	 */
	public Date getDateStart() {
		return dateStart;
	}

	/**
	 * Sets the date of starting reservation.
	 * 
	 * @param dateStart A <code>Date</code> containing the 
	 * date of starting reservation.
	 */
	public void setDateStart(Date dateStart) {
		this.dateStart = dateStart;
	}

	/**
	 * Returns the date of ending reservation.
	 * 
	 * @return  A <code>Date</code> containing the 
	 * date of ending reservation.
	 */
	public Date getDateEnd() {
		return dateEnd;
	}

	/**
	 * Sets the date of ending reservation.
	 * 
	 * @param dateEnd A <code>Date</code> containing the 
	 * date of ending reservation.
	 */
	public void setDateEnd(Date dateEnd) {
		this.dateEnd = dateEnd;
	}

	/**
	 * Returns the reservation's description.
	 * 
	 * @return A <code>String</code> containing the 
	 * description of reservation.
	 * 
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the reservation's description.
	 * 
	 * @param description A <code>String</code> containing the 
	 * description of reservation.
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Returns the {@link User} who did the 
	 * reservation.
	 * 
	 * @return the User object who did the
	 * reservation.
	 */
	public User getUser() {
		return user;
	}

	/**
	 * Sets the current user who are doing the
	 * this reservation.
	 * 
	 * @param user the User object who are doing  this
	 * reservation
	 */
	public void setUser(User user) {
		this.user = user;
	}
	
	/**
	 * Returns the  resource related to this reservation.
	 * 
	 * @return A Object resource containing the entire
	 *  resource.
	 */
	public Resource getResource() {
		return resource;
	}

	/**
	 * Sets the list of resources.
	 * 
	 * @param resources  Object resource containing the entire
	 *  resource.
	 */
	public void setResource(Resource resource) {
		this.resource = resource;
	}

	/**
	 * gets  the duration.
	 * 
	 * @return A <code>int</code> containing the duration of 
	 * reservation.
	 */
	public int getDuree() {
		return duree;
	}

	/**
	 * Sets the durartion.
	 * 
	 * @param duree A <code>int</code> containing the duration of 
	 * reservation.
	 */
	public void setDuree(int duree) {
		this.duree = duree;
	}
	
	
	
	
}