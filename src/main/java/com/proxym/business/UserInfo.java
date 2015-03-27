package com.proxym.business;

import com.proxym.domain.User;


public class UserInfo {
	
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
	 * Default constructor.
	 */
	public UserInfo() {
		
	}
	
	/**
	 * COnstructor using all values.
	 * 
	 * @param login
	 * @param password
	 * @param firstName
	 * @param lastName
	 */
	public UserInfo(String login, String password, String firstName,
			String lastName) {
		super();
		this.login = login;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	/*
	 * Getters and setters.
	 * 
	 */

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
	 * 
	 * @return A user object representing the domain
	 * object ready to be persisted into data base.
	 */
	public User toDomain(){
		User user=new User();
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setLogin(login);
		user.setPassword(password);
		return user;
	}
	
	

}
