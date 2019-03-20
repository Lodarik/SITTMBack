package ru.itmonopoly.SITTM.Service.Implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ru.itmonopoly.SITTM.Model.Task;
import ru.itmonopoly.SITTM.Repository.TaskRepository;
import ru.itmonopoly.SITTM.Service.SITTMTaskService;

@Service
public class SITTMTaskServiceImpl implements SITTMTaskService {

	@Autowired
	private TaskRepository taskRepository;
	@Override
	public Task addTask(Task task) {
		Task savedTask = taskRepository.saveAndFlush(task);
		return savedTask;
	}

	@Override
	public void delete(long id) {
		taskRepository.deleteById(id);
		
	}

	@Override
	public Task getByName(String name) {
		
		return taskRepository.findByName(name);
	}

	@Override
	public Task editTask(Task task) {
		
		return taskRepository.saveAndFlush(task);
	}

	@Override
	public  List<Task> getAll() {
		
		return taskRepository.findAll();
	}

}
