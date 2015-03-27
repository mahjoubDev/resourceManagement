//package com.proxym.utils;
//
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.Properties;
//
//import org.apache.commons.logging.Log;
//import org.apache.commons.logging.LogFactory;
//import org.joda.time.LocalDateTime;
//import org.joda.time.LocalTime;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.MessageSource;
//
//import com.proxym.config.PropertiesConfig;
//
///**
// * Singleton to handel topaze.proerties file.
// * 
// * @author Denden-OUSSAMA
// * 
// */
//public class PropertiesUtil {
//
//	/**
//	 * Declaration du log.
//	 */
//	private static final Log LOGGER = LogFactory.getLog(PropertiesUtil.class);
//
//	/**
//	 * Instance unique de la classe.
//	 */
//	private static PropertiesUtil instance;
//	
//	/**
//	 * {@link PropertiesConfig}.
//	 */
//	@Autowired
//	private PropertiesConfig propertiesConfig;
//
//	/**
//	 * Rest URL properties file.
//	 */
//	private final Properties topazeExceptionsProperties =propertiesConfig.mapper().getObject();
//
//
//	/**
//	 * private constructor.
//	 */
//	private PropertiesUtil() {
//
//	}
//
//	/**
//	 * @return a single instance of the {@link PropertiesUtil}.
//	 */
//	public static PropertiesUtil getInstance() {
//		if (instance == null)
//			instance = new PropertiesUtil();
//		return instance;
//	}
//
//	/**
//	 * retourner un message d'erreur.
//	 * 
//	 * @param errorMessageKey
//	 *            cle du message d'erreur.
//	 * @param parameters
//	 *            paramerers du message
//	 * @return message d'erreur.
//	 */
//	public String getErrorMessage(String errorMessageKey, Object... parameters) {
//		return String.format(topazeExceptionsProperties.getProperty(errorMessageKey), parameters);
//	}
//
//
//}
