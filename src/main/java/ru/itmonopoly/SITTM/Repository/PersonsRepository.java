package ru.itmonopoly.SITTM.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ru.itmonopoly.SITTM.Model.Persons;

public interface PersonsRepository extends JpaRepository<Persons, Long> {
	@Query("select t from Persons t where t.login = :login")
	Persons findByName(@Param("login") String login);
	


}
