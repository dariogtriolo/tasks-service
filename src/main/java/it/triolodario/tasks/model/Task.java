package it.triolodario.tasks.model;

import java.util.Objects;
import java.util.Set;

public class Task {

	public static enum Status {
		TODO, DOING, DONE;
	}

	private Long id;
	private String name;
	private Set<Task> subtasks;
	private Status status;

	public Task(Long id, String name, Set<Task> subtasks, Status status) {
		super();
		this.id = id;
		this.name = name;
		this.subtasks = subtasks;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Set<Task> getSubtasks() {
		return subtasks;
	}

	public Status getStatus() {
		return status;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, status, subtasks);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Task other = (Task) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name) && status == other.status
				&& Objects.equals(subtasks, other.subtasks);
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", name=" + name + ", subtasks=" + subtasks + ", status=" + status + "]";
	}

}
