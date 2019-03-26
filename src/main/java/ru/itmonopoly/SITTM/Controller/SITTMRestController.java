package ru.itmonopoly.SITTM.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ru.itmonopoly.SITTM.Model.Task;
import ru.itmonopoly.SITTM.Service.Implement.SITTMTaskServiceImpl;

@RestController
public class SITTMRestController {
	@Autowired
	SITTMTaskServiceImpl taskquery = new SITTMTaskServiceImpl();
	@GetMapping("/HelloRest")
	public String  Hello() {
		return "Helloworld";
	}

	@GetMapping("/task")
		public List<Task> ReadAll(){
			return taskquery.getAll();
		}
	@PostMapping("/task")
	 public Task writeTask(@RequestBody Task task) {
		Task savedTask = taskquery.addTask(task);
		return savedTask ;
	}
	}

