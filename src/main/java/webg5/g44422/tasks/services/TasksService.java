package webg5.g44422.tasks.services;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import webg5.g44422.tasks.interfaces.TaskDB;
import webg5.g44422.tasks.model.Task;

@Service
public class TasksService {
	
	@Autowired TaskDB taskDb;

	public Collection<Task> getTasks() {
		return StreamSupport.stream(taskDb.findAll().spliterator(), false).collect(Collectors.toList());
	}

}
