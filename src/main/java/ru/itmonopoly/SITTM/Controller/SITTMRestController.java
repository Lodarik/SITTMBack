package ru.itmonopoly.SITTM.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ru.itmonopoly.SITTM.Model.Task;
import ru.itmonopoly.SITTM.Repository.TaskRepository;



@RestController
public class SITTMRestController {
	@Autowired
	private TaskRepository taskQuery;

	
	
	// Auth
	@GetMapping("/auth")
	public void auth(@RequestBody String login) {

	}

	// Short task list
	@GetMapping("/listtask")
	public List<Task> shorttask(@RequestBody String login) {
		List<Task> shortTask;
		shortTask = taskQuery.listShortTask(login);
		return shortTask ;
	}
	@GetMapping("/fullTask")
	public Task task(@RequestBody long id) {
		return taskQuery.getOne(id);
	}

	// Test links
	@GetMapping("/HelloRest")
	public String Hello() {
		return "Helloworld";
	}

	@GetMapping("/task")
	public List<Task> getAll() {
		return taskQuery.findAll();
	}

	
}
