package deneme.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Positions")

public class Position {
	@Id
	@GeneratedValue
	@Column(name="position_id")
	private int id;
	@Column(name="position_name")
	private String name;
	
	
	public Position() {
		super();
	}


	public Position(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
}
