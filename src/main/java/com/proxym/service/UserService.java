package com.proxym.service;

import com.proxym.business.UserInfo;
import com.proxym.domain.User;
import com.proxym.exception.GestionResourceException;

/**
 * Contains  the services related to {@link UserInfo}.
 * 
 * @author Nessrine
 * @version 1.0
 *
 */
public interface UserService {

	/**
	 * add new user.
	 * 
	 * @param userInfo
	 * @throws GestionResourceException
	 */
	public void addUser (UserInfo userInfo) throws GestionResourceException;
	
	/**
	 * update existing user.
	 * 
	 * @param UserInfo
	 * @throws GestionResourceException
	 */
	public void updateUser(UserInfo userInfo) throws GestionResourceException;
	
	/**
	 * delete existing User.
	 * 
	 * @param UserInfo
	 * @throws GestionResourceException
	 */
	public void deleteUser (UserInfo userInfo) throws GestionResourceException;
	
	public User getUserById(Long id);
}
