package com.proxym.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proxym.business.UserInfo;
import com.proxym.domain.User;
import com.proxym.exception.GestionResourceException;
import com.proxym.repositories.UserRepository;

/**
 * Service class for managing Users.
 * 
 * @author Nessrine
 * @version 1.0
 *
 */
@Service("userService")
public class UserServiceImpl implements UserService {
	
	/**
	 * User repository.
	 */
	@Autowired
	private UserRepository userRepository;
	
	/**
	 * The logger instance . All log messages from this class are routed through
	 * this member.
	 */
	private final  static Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

	/**
	 * {@inheritDoc}.
	 */
	public void addUser(UserInfo userInfo)
			throws GestionResourceException {
		
		LOGGER.debug("add new user to data base ", userInfo);
		userRepository.save(userInfo.toDomain());
		
	}

	/**
	 * {@inheritDoc}.
	 */
	public void updateUser(UserInfo userInfo)
			throws GestionResourceException {
		
		LOGGER.debug("update existing User into  data base ", userInfo);
		userRepository.save(userInfo.toDomain());
		
	}

	/**
	 * {@inheritDoc}.
	 */
	public void deleteUser(UserInfo userInfo)
			throws GestionResourceException {
		
		LOGGER.debug("delete User fom  data base ", userInfo);
		userRepository.delete(userInfo.toDomain());
		
	}

	public User getUserById(Long id) {
		return  userRepository.findOne(id);
	}

}
