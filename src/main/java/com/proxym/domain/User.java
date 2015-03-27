package com.proxym.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.proxym.business.UserInfo;

/**User  object is a representation of User data.
 * 
 * @author Nessrine.
 * @version 1.0.
 *
 */
@Entity
public class User {
	
	/**
	 * primary key.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	/**
	 * login of the user.
	 */
	private String login;
	
	/**
	 * password of the user.
	 */
	private String password;
	
	/**
	 * the first name of the user.
	 */
	private String firstName;
	
	/**
	 * the Last name of the user.
	 */
	private String lastName;
	
	/**
	 * Collection of reservation did by the user.
	 */
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL,mappedBy="user")
	private Set<Reservation> reservations=new HashSet<Reservation>();

	/**
	 * Default constructor.
	 */
	public User() {
		
	}
	
	/*
	 * Getters and setters.
	 * 
	 */
	
	/**
	 * Returns the user's ID.
	 * 
	 * @return A <code>Long</code> containing the 
	 * id of the current user.
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Sets the user's ID.
	 * 
	 * @param id A <code>Long</code> containing the 
	 * id of the current user.
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Returns the user's login.
	 * 
	 * @return A <code>String</code> containing the
	 * login of the user.
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * Sets the user's login.
	 * 
	 * @param login A <code>String</code> containing the
	 * login of the user.
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * Returns the user's password.
	 * 
	 * @return A <code>String</code> containing the 
	 * password of the user.
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the user's password.
	 * 
	 * @param password A <code>String</code> containing the 
	 * password of the user.
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Returns the user's firstName.
	 * 
	 * @return A <code>String</code> containing 
	 * the first name of the user.
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the user's firstName.
	 * 
	 * @param firstName A <code>String</code> containing 
	 * the first name of the user.
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Returns the user's lastName.
	 * 
	 * @return A <code>String</code> containing 
	 * the last  name of the user.
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the user's lastName.
	 * 
	 * @param lastName A <code>String</code> containing 
	 * the last  name of the user.
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Returns the list of reservations did 
	 * the current user.
	 * 
	 * @return A <code>Collection</code> containing all the 
	 * reservations associated to this user.
	 */
	public Set<Reservation> getReservations() {
		return reservations;
	}

	/**
	 * Sets the user's reservations.
	 * 
	 * @param reservations  A <code>Collection</code> containing all the 
	 * reservations associated to this user.
	 */
	public void setReservations(Set<Reservation> reservations) {
		this.reservations = reservations;
	}
	
	public UserInfo toBusiness(){
		UserInfo userInfo=new UserInfo();
		userInfo.setFirstName(firstName);
		userInfo.setLastName(lastName);
		userInfo.setLogin(login);
		userInfo.setPassword(password);
		return userInfo;
	}
	
	
	

}
