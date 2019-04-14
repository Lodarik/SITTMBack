package ru.itmonopoly.SITTM.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itmonopoly.SITTM.Model.Positions;

public interface PositionRepository extends JpaRepository<Positions,Long > {

}
