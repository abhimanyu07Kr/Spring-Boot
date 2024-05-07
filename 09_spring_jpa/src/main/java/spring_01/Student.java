package spring_01;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Student {
	@Id
	private Integer stuRoll;
	private String stuName;
	private String stuBranch;
	private int stuAge;
	
	
	
	public Integer getStuRoll() {
		return stuRoll;
	}
	public void setStuRoll(Integer stuRoll) {
		this.stuRoll = stuRoll;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuBranch() {
		return stuBranch;
	}
	public void setStuBranch(String stuBranch) {
		this.stuBranch = stuBranch;
	}
	
	public int getStuAge() {
		return stuAge;
	}
	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}
	@Override
	public String toString() {
		return + stuRoll + " " + stuName + " " + stuBranch +" "+stuAge;
	}
	
	
	
	

}
