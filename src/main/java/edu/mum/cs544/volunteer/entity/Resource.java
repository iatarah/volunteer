/**
 * 
 */
package edu.mum.cs544.volunteer.entity;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Ivan
 *
 */
@Entity
public class Resource {
	@Id
	@GeneratedValue
	private int id;
	private String resourceId;
	private String name;
	private String description;
	@Enumerated
	private ResourceCategory category;
	
	public Resource() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getResourceId() {
		return resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ResourceCategory getCategory() {
		return category;
	}

	public void setCategory(ResourceCategory category) {
		this.category = category;
	}
	
	
	
}
