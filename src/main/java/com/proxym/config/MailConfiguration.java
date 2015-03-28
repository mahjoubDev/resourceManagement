//package com.proxym.config;
//
//import java.util.Properties;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.mail.javamail.JavaMailSender;
//import org.springframework.mail.javamail.JavaMailSenderImpl;
//
///**
// * This class sets up all the configuration needed
// * by the system to send an E-mail.
// * 
// * @author TECNETMEDIA
// * @version 1.0
// *
// */
//@Configuration
//@PropertySource("classpath:mail.properties")
//public class MailConfiguration {
//
//	/**
//	 * the protocol.
//	 */
//	@Value("${mail.protocol}")
//	private String protocol;
//
//	/**
//	 * the host.
//	 */
//	@Value("${mail.host}")
//	private String host;
//
//	/**
//	 * the email port.
//	 */
//	@Value("${mail.port}")
//	private int port;
//	@Value("${mail.smtp.auth}")
//	private boolean auth;
//	@Value("${mail.smtp.starttls.enable}")
//	private boolean starttls;
//	@Value("${mail.from}")
//	private String from;
//	@Value("${mail.username}")
//	private String username;
//	@Value("${mail.password}")
//	private String password;
//
//	@Bean
//	public JavaMailSender javaMailSender() {
//		JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
//		Properties mailProperties = new Properties();
//		mailProperties.put("mail.smtp.auth", auth);
//		mailProperties.put("mail.smtp.starttls.enable", starttls);
//		mailSender.setJavaMailProperties(mailProperties);
//		mailSender.setHost(host);
//		mailSender.setPort(port);
//		mailSender.setProtocol(protocol);
//		mailSender.setUsername(username);
//		mailSender.setPassword(password);
//		return mailSender;
//	}
//}