package com.proxym.utils;

import com.proxym.domain.Categorie;
import com.proxym.domain.Reservation;
import com.proxym.domain.Resource;
import com.proxym.domain.User;
import com.proxym.exception.GestionResourceException;

/**
 * Tools class used to validate data coming from the client 
 * part.
 * 
 * @author Nessrine.
 * @version 1.0
 *
 */
public class ResourceValidator {
	
	/**
	 * check if the category with the target reference
	 * exist in the system.
	 * 
	 * @param referenceCategory reference of the category.
	 * @param categorie the category that matches the reference
	 * @throws GestionResourceException indicates there is a problem.
	 */
	public static void checkCategoryExist(String referenceCategory,Categorie categorie) throws GestionResourceException {
		if(categorie==null){
			throw new GestionResourceException("", "La categorie de reference "+referenceCategory+"  n'existe pas");
		}
	}
	
	/**
	 * Check if the user with the target login
	 * exist in the system.
	 * 
	 * @param loginUser login of the user.
	 * @param user user that matches the login.
	 * @throws GestionResourceException indicates there is a problem.
	 */
	public static void checkUserExist(String loginUser,User user) throws GestionResourceException{
		
		if(user==null){
			throw new GestionResourceException("", "L'utilisateur de login "+loginUser+"  n'existe pas");
		}
		
	}
	
	/**
	 * Check if the resource with the target reference
	 * exists in the system.
	 * 
	 * @param reference reference of the resource.
	 * @param resource resource that matches the reference.
	 * @throws GestionResourceException indicates there is a problem.
	 */
	public static void checkResourceExist(String reference,Resource resource) throws GestionResourceException{
		if(resource==null) {
			throw new GestionResourceException("", "La resource de reference "+reference+"  n'existe pas");
		}
		
	}
	
	/**
	 * Check if the reservation with the target reference
	 * exist in the system.
	 * 
	 * @param refrence reference of the reservation
	 * @param reservation reservation that matches the reference.
	 * @throws GestionResourceException indicates there is a problem.
	 */
	public static  void checkReservationExist(String reference,Reservation reservation) throws GestionResourceException{
		if(reservation==null){
			throw new GestionResourceException("", "La resoreservationurce de reference "+reference+"  n'existe pas");
		}
	}

}
