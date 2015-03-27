package com.proxym.utils;

import com.proxym.domain.Categorie;
import com.proxym.exception.GestionResourceException;

/**
 * 
 * @author Nessrine.
 * @version 1.0
 *
 */
public class ResourceValidator {
	
	public static void checkCategoryExist(String referenceCategory,Categorie categorie) throws GestionResourceException {
		if(categorie==null){
			throw new GestionResourceException("", "La categorie de reference "+referenceCategory+"  n'existe pas");
		}
	}

}
