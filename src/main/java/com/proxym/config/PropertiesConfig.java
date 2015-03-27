package com.proxym.config;

import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

/**
 * Class used to get exception code and message from 
 * properties file.
 * 
 * @author Nessrine.
 * @version 1.0.
 *
 */
@Component("propertiesConfig")
public class PropertiesConfig {

	/**
	 * create bean properties.
	 * 
	 * @return {@link Bean}
	 */
	@Bean(name="resourceExceptionProperties")
	public PropertiesFactoryBean mapper() {
		PropertiesFactoryBean bean = new PropertiesFactoryBean();
		bean.setLocation(new ClassPathResource("exception.properties"));
		return bean;
	}

}
