package com.nagp.user.persistence.memory;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.nagp.user.entities.User;

@Repository
public class UserInMemoryRepository {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserInMemoryRepository.class);
	protected final Map<String, User> users = new HashMap<>();

	public UserInMemoryRepository() {
		users.put("1", new User("Priya Kwatra", "23", "priya.kwatra@nagarro.com"));
	}

	public Optional<User> getByUserId(String userId) {
		return Optional.ofNullable(users.get(userId));
	}

}
