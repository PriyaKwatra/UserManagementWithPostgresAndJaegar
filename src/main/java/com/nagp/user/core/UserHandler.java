package com.nagp.user.core;

import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.nagp.user.entities.User;
import com.nagp.user.persistence.memory.UserInMemoryRepository;

@Service
public class UserHandler {

	@Resource
	UserInMemoryRepository userInMemoryRepository;

	public Optional<User> getByUserId(String userId) {
		return userInMemoryRepository.getByUserId(userId);
	}

}
