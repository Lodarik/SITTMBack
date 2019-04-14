package ru.itmonopoly.SITTM.Service.Implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ru.itmonopoly.SITTM.Model.Positions;
import ru.itmonopoly.SITTM.Repository.PositionRepository;
import ru.itmonopoly.SITTM.Service.SITTMPositionsService;

@Service
public class SITTMPositionsServiceImpl implements SITTMPositionsService {
	@Autowired
	private PositionRepository positionRepository;

	@Override
	public Positions addPosition(Positions position) {
		Positions newPosition = positionRepository.saveAndFlush(position);
		return newPosition;
	}

}
