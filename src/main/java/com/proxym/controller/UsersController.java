package com.proxym.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.proxym.business.UserInfo;
import com.proxym.exception.GestionResourceException;
import com.proxym.service.UserService;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;

/**
 * Rest controller for managing the User.
 * 
 * @author Nessrine
 * @version 1.0
 */
@Api(basePath = "/proxym", value = "Users", description = "Operations with users", produces = "application/json")
@RestController
@RequestMapping(value = "/proxym/user", produces = MediaType.APPLICATION_JSON_VALUE)
public class UsersController {

	/**
	 * user service {@link UserService}.
	 */
	@Autowired
	private UserService userService;

	/**
	 * The logger instance . All log messages from this class are routed through
	 * this member.
	 */
	private final static Logger LOGGER = LoggerFactory
			.getLogger(UsersController.class);

	/**
	 * add new user.
	 * 
	 * @param user
	 * @throws GestionResourceException
	 */
	@RequestMapping(value = "/add", method = RequestMethod.POST,produces="application/json")
	@ApiOperation(value = "Create new user", notes = "Creates new user")
	public void addUser(@RequestBody UserInfo userInfo)
			throws GestionResourceException {

		LOGGER.debug("adding user from controller ", userInfo);
		userService.addUser(userInfo);

	}

	/**
	 * update existing user.
	 * 
	 * @param user
	 * @throws GestionResourceException
	 */
	@RequestMapping(value = "/update", method = RequestMethod.POST,produces="application/json")
	@ApiOperation(value = "Update existing  user", notes = "Update existing  user")
	public void updateUser(UserInfo userInfo) throws GestionResourceException {

		LOGGER.debug("updating user from controller ", userInfo);
		userService.updateUser(userInfo);
	}

	/**
	 * delete existing user.
	 * 
	 * @param user
	 * @throws GestionResourceException
	 */
	@RequestMapping(value = "/delete", method = RequestMethod.POST,produces="application/json")
	@ApiOperation(value = "Delete existing  user", notes = "Delete existing  user")
	public void deleteUser(@RequestBody UserInfo userInfo) throws GestionResourceException {

		LOGGER.debug("deleting user from controller ", userInfo);
		userService.deleteUser(userInfo);

	}
	
	@RequestMapping(value = "/get", method = RequestMethod.GET,produces="application/json")
	@ApiOperation(value = "get existing  user", notes = "get existing  user")
	public UserInfo getUser() throws GestionResourceException {
		return userService.getUserById(1l).toBusiness();
		
	}

//	@RequestMapping("/Hello")
//	public String index() {
//		return "Welcome to the home page!";
//	}

}
