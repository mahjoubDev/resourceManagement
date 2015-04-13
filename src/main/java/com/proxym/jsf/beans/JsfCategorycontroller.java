package com.proxym.jsf.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RestController;

import com.proxym.business.CategorieInfo;
import com.proxym.exception.GestionResourceException;
import com.proxym.service.CategorieService;

/**
 * 
 * @author Nessrine.
 * @version 1.0
 *
 */
@RestController
@Scope("view")
public class JsfCategorycontroller {

	/**
	 * The logger instance . All log messages from this class are routed through this member.
	 */
	private final static Logger LOGGER = LoggerFactory.getLogger(JsfCategorycontroller.class);

	/**
	 * {@link CategorieService}
	 */
	@Autowired
	private CategorieService categorieService;

	/**
	 * object used to hold the category fields.
	 */
	private CategorieInfo categorieInfoToAdd =new CategorieInfo();

	/**
	 * add new category.
	 * 
	 * @throws GestionResourceException
	 */
	public void addcategory() throws GestionResourceException {

		LOGGER.debug("add new category", categorieInfoToAdd);
		if (categorieInfoToAdd != null) {
			categorieService.addCategory(categorieInfoToAdd);
			categorieInfoToAdd=new CategorieInfo();
		}
	}

	/**
	 * 
	 * @return
	 */
	public CategorieInfo getCategorieInfoToAdd() {
		return categorieInfoToAdd;
	}

	/**
	 * 
	 * @param categorieInfoToAdd
	 */
	public void setCategorieInfoToAdd(CategorieInfo categorieInfoToAdd) {
		this.categorieInfoToAdd = categorieInfoToAdd;
	}
	
	

}
