package it.triolodario.tasks.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import it.triolodario.tasks.daoservice.UserDaoService;
import it.triolodario.tasks.model.User;

@RestController
public class UserController {

	private final UserDaoService userService;

	public UserController(UserDaoService userService) {

		this.userService = userService;
	}

	@GetMapping(path = "/api/users")
	public List<User> findAll() {

		return userService.findAll();
	}

	@GetMapping(path = "/api/users/{id}")
	public User findOne(@PathVariable Long id) {

		return userService.findOne(id);
	}
}
