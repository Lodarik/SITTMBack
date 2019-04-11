package ru.itmonopoly.SITTM.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.itmonopoly.SITTM.Model.Persons;

public interface PersonsRepository extends JpaRepository<Persons,Long> {

}
