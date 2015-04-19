package com.proxym.jsf.converters;

import javax.annotation.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RestController;

import com.proxym.domain.Categorie;
import com.proxym.repositories.CategorieRepository;


@RestController
@Scope("view")
public class CategoryConverter implements Converter {
	
	private CategorieRepository CategorieRepository;

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String id) {
		return CategorieRepository.findOne(Long.valueOf(id));
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object value) {
		return ((Categorie)value).getId().toString();
	}

}
