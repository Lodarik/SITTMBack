package ru.itmonopoly.SITTM.Repository;




import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import ru.itmonopoly.SITTM.Model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

	@Query("select t from Task t where t.name = :name")
	Task findByName(@Param("name") String name);
	@Query("select id, name, description from Task  where login = :login")
	public List<Task> listShortTask(@Param("login") String login);
    
	
}
