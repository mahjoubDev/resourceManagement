package com.proxym.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proxym.domain.Categorie;
import com.proxym.domain.Resource;
import com.proxym.domain.User;
import com.proxym.exception.GestionResourceException;

/**
 * Spring data repository for the {@link User} entity.
 * 
 * @author Nessrine
 * @version 1.0
 *
 */
public interface UserRepository  extends JpaRepository<User, Long>{
	
	/**
	 * get the resource object using its login.
	 * 
	 * @param  login used to look for the target object
	 * 
	 * @return Object User or null if the login doesn't match any one in
	 * the data base.
	 * 
	 * @throws GestionResourceException indicating there is a problem accessing
	 * data base or some what else.
	 *
	 */
	public User findByLogin(String login) throws GestionResourceException;

}
