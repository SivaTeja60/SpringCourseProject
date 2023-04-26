package io.project.springbootstarter.topic;

public class Topic {
	private String id;
	private String name;
	private String description;
	
	public Topic() {
		
	}
	
	public Topic(String string, String string2, String string3) {
		// TODO Auto-generated constructor stub
		super();
		this.id=id;
		this.description=description;
		this.name=name;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	
	

}
