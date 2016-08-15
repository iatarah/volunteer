/**
 * 
 */
package edu.mum.cs544.volunteer.entity;

import java.util.List;

import javax.persistence.Entity;




/**
 * @author Ivan
 *
 */
@Entity
public class Administrator extends User{
	private List<Project> projects;

	public Administrator() {
		super();
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	@Override
	public String toString() {
		return "Administrator [getId()=" + getId() + ", getUserId()=" + getUserId() + ", getFirstName()="
				+ getFirstName() + ", getLastName()=" + getLastName() + ", getRole()=" + getRole()
				+ ", getUserPassword()=" + getUserPassword() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
}
