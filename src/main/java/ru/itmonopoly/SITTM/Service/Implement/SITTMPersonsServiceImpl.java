package ru.itmonopoly.SITTM.Service.Implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ru.itmonopoly.SITTM.Model.Persons;
import ru.itmonopoly.SITTM.Repository.PersonsRepository;
import ru.itmonopoly.SITTM.Service.SITTMPersonService;

@Service
public class SITTMPersonsServiceImpl implements SITTMPersonService {
	@Autowired
	private PersonsRepository personsRepository;

	
	public Persons addperson(Persons person) {
		Persons newuser = personsRepository.saveAndFlush(person);
		return newuser;
	}

	public Persons findUser(String login) {
		Persons user = personsRepository.findByName(login);
		return user;
	}



}
