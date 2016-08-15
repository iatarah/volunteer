/**
 * 
 */
package edu.mum.cs544.volunteer.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

/**
 * @author Ivan
 *
 */
@Entity
public class Volunteer extends User{
	

	@ManyToMany(mappedBy="volunteers")
	private List<Task> tasks;

	public Volunteer() {
		super();
	}

	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}
	
	
}
