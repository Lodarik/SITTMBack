package ru.itmonopoly.SITTM.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Task")
public class Task {
	@Id
	@GeneratedValue(generator = "increment")
	@Column(name = "id")
	private long id;
	@Column(name = "name", length = 50, nullable = false)
	private String name;
	@Column(name = "priority", nullable = false)
	private int priority;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "login",insertable = false, updatable = false)
	private Persons asignee;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "login",insertable = false, updatable = false)
	private Persons initiator;
	@Column(name = "date", nullable = false)
	private String date;
	@Column(name = "status", length = 500, nullable = false)
	@Enumerated(EnumType.STRING)
	private Statuses status;
	@Column(name = "description")
	private String description;

	public long getId() {
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
		return "id" + this.id + "Name" + this.name + "Priority" + this.priority + "Asignee" + this.asignee + "Initiator"
				+ this.initiator + "Date" + this.date + "Status" + this.status + "Description" + this.description;

	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public Persons getAsignee() {
		return asignee;
	}

	public void setAsignee(Persons asignee) {
		this.asignee = asignee;
	}

	public Persons getInitiator() {
		return initiator;
	}

	public void setInitiator(Persons initiator) {
		this.initiator = initiator;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Statuses getStatus() {
		return status;
	}

	public void setStatus(Statuses status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
