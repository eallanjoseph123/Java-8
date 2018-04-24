package com.java.sample;

import java.util.List;

public class Teacher {
	
	private List<Student> students;
	
	private List<String> subjects;
	
	private boolean masters;
	
	private boolean phd;
	
	private String name;
	


	public Teacher(String name,boolean masters, boolean phd) {
		this.masters = masters;
		this.phd = phd;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isMasters() {
		return masters;
	}

	public void setMasters(boolean masters) {
		this.masters = masters;
	}

	public boolean isPhd() {
		return phd;
	}

	public void setPhd(boolean phd) {
		this.phd = phd;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}
	
	
	
	
}
