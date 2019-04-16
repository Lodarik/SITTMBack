package ru.itmonopoly.SITTM.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ru.itmonopoly.SITTM.Model.Task;
import ru.itmonopoly.SITTM.Service.Implement.SITTMPersonsServiceImpl;
import ru.itmonopoly.SITTM.Service.Implement.SITTMTaskServiceImpl;


@RestController
public class SITTMRestController {
	@Autowired
	SITTMTaskServiceImpl taskquery = new SITTMTaskServiceImpl();
	@Autowired
	SITTMPersonsServiceImpl personQuery = new SITTMPersonsServiceImpl();

	// Auth
	

	@GetMapping("/auth")
	public void auth(@RequestBody String login) {

	}

	// Short task list
	@GetMapping("/viewtask")
	public List<HashMap<String, String>> shorttask() {
		Task task = new Task();
		List<Task> fullTask;
		fullTask = taskquery.getAll();
		List<HashMap<String, String>> fin = new ArrayList<HashMap<String, String>>();
		for (int i = 0; i < fullTask.size(); i++) {
			HashMap<String, String> result = new HashMap<>();
			long id;
			String idStr;
			String name;
			String descr;
			task = fullTask.get(i);
			name = task.getName();
			descr = task.getDescription();
			id = task.getId();
			idStr = Objects.toString(id);
			result.put("id", idStr);
			result.put("name", name);
			result.put("descr", descr);
			fin.add(result);

		}
		return fin;
	}

	// Test links
	@GetMapping("/HelloRest")
	public String Hello() {
		return "Helloworld";
	}

	@GetMapping("/task")
	public List<Task> ReadAll() {
		return taskquery.getAll();
	}

	@PostMapping(path = "/task", produces = MediaType.APPLICATION_XML_VALUE)
	public Task writeTask(@RequestBody Task task) {
		Task savedTask = taskquery.addTask(task);
		return savedTask;
	}
}
