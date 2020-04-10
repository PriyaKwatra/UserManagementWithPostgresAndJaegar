package com.nagp.user.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagp.user.core.UserHandler;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
	@Autowired
	UserHandler userHandler;

	@GetMapping(value = "/{userId}")
	com.nagp.user.entities.User getUser(@PathVariable(name = "userId") String userId) {
		return userHandler.getByUserId(userId);
	}

}
