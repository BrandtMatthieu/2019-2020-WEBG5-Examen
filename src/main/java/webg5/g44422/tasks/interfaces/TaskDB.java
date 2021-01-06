package webg5.g44422.tasks.interfaces;

import org.springframework.data.repository.CrudRepository;

import webg5.g44422.tasks.model.Task;

public interface TaskDB extends CrudRepository<Task, String> {
	
}
