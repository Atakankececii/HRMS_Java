package deneme.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import deneme.hrms.entities.concretes.Position;



public interface PositionDao extends JpaRepository<Position,Integer>{

}
