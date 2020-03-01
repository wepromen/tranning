package edu.tranning.spring.domain;

public class Student {
	private String name,gpa,major;

	public Student() {
		super();
	}

	public Student(String name, String gpa, String major) {
		super();
		this.name = name;
		this.gpa = gpa;
		this.major = major;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGpa() {
		return gpa;
	}

	public void setGpa(String gpa) {
		this.gpa = gpa;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", gpa=" + gpa + ", major=" + major + "]";
	}
	
	
}
