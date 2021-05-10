package deneme.hrms.business.abstracts;

import java.util.List;

import deneme.hrms.entities.concretes.Position;

public interface PositionService {
	List<Position> getAll();
}
