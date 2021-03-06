package ru.itmonopoly.SITTM.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ru.itmonopoly.SITTM.Model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

	@Query("select t from Task t where t.name = :name")
	Task findByName(@Param("name") String name);

}
