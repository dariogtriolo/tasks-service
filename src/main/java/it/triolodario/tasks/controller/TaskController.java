package it.triolodario.tasks.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

	@GetMapping(path="/api/greetings")
	public String greetings() {

		return "Hello Tasks!";
	}

}
