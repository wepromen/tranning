package edu.tranning.spring.model;

public class Student {
	private String id, name;
	private int majorId;
	
	public Student() {
		
	}
	
	public Student(String id, String name, int majorId) {
		super();
		this.id = id;
		this.name = name;
		this.majorId = majorId;
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
		
	public int getMajorId() {
		return majorId;
	}

	public void setMajorId(int majorId) {
		this.majorId = majorId;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", majorId=" + majorId + "]";
	}

	
	
	
	
}
