package com.proxym.jsf.beans;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RestController;

import com.proxym.business.CategorieInfo;
import com.proxym.domain.Categorie;
import com.proxym.exception.GestionResourceException;
import com.proxym.service.CategorieService;

/**
 * Backed bean for managing the categories
 * views.
 * 
 * @author Nessrine.
 * @version 1.0
 *
 */
@RestController
@Scope("view")
public class JsfCategoryController {

	/**
	 * The logger instance . All log messages from this class are routed through this member.
	 */
	private final static Logger LOGGER = LoggerFactory.getLogger(JsfCategoryController.class);

	/**
	 * {@link CategorieService}
	 */
	@Autowired
	private CategorieService categorieService;

	/**
	 * object used to hold the category fields.
	 */
	private CategorieInfo categorieInfoToAdd = new CategorieInfo();

	/**
	 * add new category.
	 * 
	 * @throws GestionResourceException
	 */
	public void addcategory() throws GestionResourceException {

		LOGGER.debug("add new category", categorieInfoToAdd);
		if (categorieInfoToAdd != null) {
			categorieService.addCategory(categorieInfoToAdd);
			categorieInfoToAdd = new CategorieInfo();
		}
	}

	/**
	 * Gets all the categories.
	 * 
	 * @return A <code>Collection</code> containing all the categories.
	 * 
	 * @throws GestionResourceException indicates there's problem.
	 */
	public List<Categorie> getAllCategories() throws GestionResourceException {
		
		LOGGER.debug("retieving alla the categories existing in the system");
		return categorieService.findAll();
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
