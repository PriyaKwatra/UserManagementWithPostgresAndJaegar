package com.nagp.user.core;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.nagp.user.entities.User;
import com.nagp.user.persistence.postgres.UserPo;
import com.nagp.user.persistence.postgres.UserRepository;

@Service
public class UserHandler {

	@Resource
	UserRepository userRepository;

	public User getByUserId(String userId) {
		return toUserDto(userRepository.findById(userId).get());
	}

	private User toUserDto(UserPo userPo) {
		return new User(userPo.getName(), userPo.getAge(), userPo.getEmail());
	}

}
