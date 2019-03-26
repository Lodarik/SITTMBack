package ru.itmonopoly.SITTM.Service;

import java.util.List;

import ru.itmonopoly.SITTM.Model.Task;

public interface SITTMTaskService {
Task addTask(Task task);
void delete(long id);
Task getByName(String name);
Task editTask(Task task);
List<Task> getAll();

}
