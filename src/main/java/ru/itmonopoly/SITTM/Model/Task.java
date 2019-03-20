package ru.itmonopoly.SITTM.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Task")
public class Task  {
	@Id
	@GeneratedValue (generator = "increment")
	@Column (name = "id")
	private int id;
	@Column (name = "name")
	private String name;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "id" + this.id + "Name" + this.name;
	}
}
