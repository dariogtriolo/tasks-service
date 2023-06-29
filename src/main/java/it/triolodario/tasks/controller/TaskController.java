package it.triolodario.tasks.controller;

import java.util.HashSet;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import it.triolodario.tasks.model.Task;

@RestController
public class TaskController {

	@GetMapping(path = "/api/greetings")
	public String greetings() {

		return "Hello Tasks!";
	}

	@GetMapping(path = "/api/tasks")
	public Task getTasks() {

		return new Task("myTask", new HashSet<>(), Task.Status.DOING);
	}
	
	@GetMapping(path = "/api/tasks/{name}")
	public Task getTasksByName(@PathVariable String name ) {

		return new Task(name, new HashSet<>(), Task.Status.DOING);
	}

}
