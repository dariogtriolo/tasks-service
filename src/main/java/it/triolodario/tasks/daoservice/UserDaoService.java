package it.triolodario.tasks.daoservice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import it.triolodario.tasks.model.User;

@Component
/*
 * Db operations
 * 
 */
public class UserDaoService {

	// For now just use static in memory List
	private static List<User> users = new ArrayList<>();

	static {
		users.add(new User(1L, "Dario", LocalDate.now()));
		users.add(new User(2L, "Giovanni", LocalDate.now().minusYears(40)));
	}

	public List<User> findAll() {
		return users;
	}

	public User save(User user) {

		User newUser = new User((long) users.size(), user.getName(), user.getBirthDate());
		users.add(newUser);

		return findOne(newUser.getId());
	}

	public User findOne(Long id) {

		return users.stream().filter((User user) -> user.getId().equals(id)).findFirst().orElseGet(null);
	}
}
