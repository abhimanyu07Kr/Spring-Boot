package com.abhi;

public class Student {
	
	String name;
	int id;
	String branch;
	
	public Student(String name,int id,String branch)
	{
		this.name=name;
		this.id=id;
		this.branch=branch;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", branch=" + branch + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	

}
